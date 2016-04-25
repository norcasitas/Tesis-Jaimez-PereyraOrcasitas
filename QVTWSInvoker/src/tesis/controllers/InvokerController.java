package tesis.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import t2m.Comparsion;
import t2m.T2Mwsdl;
import t2m.Transformation;
import tesis.crud.CategoryCRUD;
import tesis.crud.WsdlCRUD;
import tesis.models.Category;
import tesis.models.Wsdl;
import tesis.request_model.RequestModel.Method;
import tesis.request_model.RequestModel.Parameter;
import tesis.request_model.RequestModel.RequestModel;
import tesis.request_model.RequestModel.RequestModelFactory;
import tesis.ui.InvokerUI;
import tesis.ui.MainUI;
import tesis.utils.DataBase;
import tesis.utils.InvokeWS;
import tesis.utils.StringTreatment;
import tesis.utils.TypesOfWsdl;
import utils.Pair;
import utils.Utils;

public class InvokerController implements ActionListener, ItemListener {

    private InvokerUI invokerUI;
    private MainUI mainUI;
    private CategoryCRUD categoryCRUD; //(*-) crud for categories
    private WsdlCRUD wsdlCRUD; //(*-) crud for wsdl
    private List<Category> categories;
    private ArrayList<Object> params;
    private InvokeWS invokeWS;

    public InvokerController(MainUI mainUI, InvokerUI invokerUI) {
        this.invokerUI = invokerUI;
        this.mainUI = mainUI;
        categoryCRUD = new CategoryCRUD();
        loadCategories();
        invokerUI.setActionListener(this);
        invokerUI.setItemListener(this);
        invokeWS = new InvokeWS();
        wsdlCRUD = new WsdlCRUD();
    }

    /**
     * (*-) this method loads categories into the gui
     */
    public void loadCategories() {
        DataBase.openDataBase();
        categories = categoryCRUD.getAllCategories();
        for (Category c : categories) {
            invokerUI.getSpnCategory().addItem(c.get("name"));
        }
        invokerUI.getBtnSearchInvoke().setEnabled(invokerUI.getSpnCategory().getItemCount() != 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == invokerUI.getBtnSearchInvoke()) {
            ArrayList<Pair<String, String>> methods = getMethodsMatch();

        }
        if (e.getSource() == invokerUI.getBtnYes()) {
            /**
             * (*-) Le sirvió la invocación, calcula la nueva reputación
             */
            Wsdl wsdl = wsdlCRUD.findByName(invokerUI.getWsInvoked().getText());
            wsdlCRUD.editReputation(wsdl, true);
            invokerUI.enableResult(false);
        }
        if (e.getSource() == invokerUI.getBtnNo()) {
            /**
             * (*-) No le sirvió la invocación, calcula la nueva reputación
             */
            Wsdl wsdl = wsdlCRUD.findByName(invokerUI.getWsInvoked().getText());
            wsdlCRUD.editReputation(wsdl, false);
            invokerUI.enableResult(false);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        /**
         * (*-)habilita los parametros en base a cuantos desea el usuario
         */
        invokerUI.enableParams(Integer.valueOf((String) e.getItem()));
    }

    /**
     * (*-) obtiene la información desde la gui, y crea una requestModel
     * retornandola
     *
     * @return
     */
    private RequestModel getDataFromUI() {
        //(*-)crea una request model
        RequestModelFactory factory = RequestModelFactory.eINSTANCE;
        RequestModel requestModel = factory.createRequestModel();
        String methodName = invokerUI.getTxtMethodName().getText();
        requestModel.setName(methodName);
        Method method = factory.createMethod();
        method.setName(methodName);
        Parameter outputParam = factory.createParameter();
        outputParam.setName("output");
        outputParam.setType("string");
        method.getOutParameters().add(outputParam);
        params = new ArrayList<>();
        Integer numParams = Integer.valueOf((String) invokerUI.getSpnNumberParam().getSelectedItem());
        for (int i = 0; i < numParams; i++) {
            /**
             * (*-)para toda la cantidad de parametros elegidos, obtiene el tipo
             * y el valor, casteandolo, si falla el cast returna null
             */
            String type = ((JComboBox) (invokerUI.getPanelParamater(i).getComponent(1))).getSelectedItem().toString();
            String value = StringTreatment.deleteAccent(((JTextField) invokerUI.getPanelParamater(i).getComponent(3)).getText());
            try {
                switch (type) {
                    case TypesOfWsdl.typeDouble:
                        params.add(Double.valueOf(value));
                        break;
                    case TypesOfWsdl.typeFloat:
                        params.add(Float.valueOf(value));
                        break;
                    case TypesOfWsdl.typeInteger:
                        params.add(Integer.valueOf(value));
                        break;
                    default:
                        params.add(value);
                }
            } catch (Exception e) {
                /**
                 * (*-)Falló la conversión de un tipo, retorna null
                 */
                System.err.println(e);
                return null;
            }
            Parameter inputParam = factory.createParameter();
            inputParam.setName("param-" + i);
            inputParam.setType(type);
            method.getInParameters().add(inputParam);
        }
        requestModel.getMethods().add(method);
        return requestModel;
    }

    /**
     * (*-)Toma la ruta a un archivo wsdl.ecore y una request, compara los
     * modelos y si está incluido, retorna los nombres que machean
     *
     * @param pathWsdl ruta al wsdlRequest.ecore
     * @param request request del usuario
     * @return
     * @throws IOException
     */
    private ArrayList<String> comparsion(String pathWsdl, RequestModel request) throws IOException {
        Comparsion comparsion = new Comparsion();
        comparsion.setRequestModelWSDL((RequestModel) Utils.getFromXMI(pathWsdl).get(0));
        ArrayList<String> operations = comparsion.getMachOperations(request);
        return operations;
    }

    /**
     * (*-)obtiene todos los nombres de los metodos y url que machean con la
     * request del usuario
     *
     * @return
     */
    private ArrayList<Pair<String, String>> getMethodsMatch() {
        ArrayList<Pair<String, String>> methods = new ArrayList<>();
        RequestModel request = getDataFromUI();
        if (request != null) {
            Utils.exportRequestModeltoXMI(request);
            DataBase.openDataBase();
            List<Wsdl> wsdls = categoryCRUD.getChilds(categories.get(invokerUI.getSpnCategory().getSelectedIndex()));
            for (Wsdl wsdl : wsdls) {
                try {
                    /**
                     * (*-)Realizo una transformación para cada wsdl de la
                     * categoría elegida,comparo ese wsdl con la request y si
                     * está incluido retorno los nombres de los métodos que
                     * machearon
                     */
                    String url = wsdl.getString("url");
                    String nameDefinition = new T2Mwsdl().transformT2M(url);
                    String outputPath = Utils.getAbsolutePathRunning() + "/folder_outputs/" + nameDefinition + ".xmi";
                    new Transformation().startTransformation(Utils.getAbsolutePathRunning() + "/folder_outputs/" + nameDefinition + ".xmi", outputPath);
                    for (String methodName : comparsion(outputPath, request)) {
                        methods.add(new Pair<>(url, methodName));
                    }
                } catch (MalformedURLException ex) {
                    Logger.getLogger(InvokerController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(InvokerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return methods;
    }

    /**
     * (*-)invoco el mejor wsdl que macheo, si falla la invocación llamo al que
     * sigue
     *
     * @param methods
     */
    private void invokeWS(ArrayList<Pair<String, String>> methods) {
        if (methods.size() > 0) {
            boolean invoke = false;
            Iterator<Pair<String, String>> it = methods.iterator();
            while (it.hasNext() && !invoke) {
                Pair<String, String> pair = it.next();
                String callMethod = pair.snd();
                String url = pair.fst();
                try {
                    String result = invokeWS.obtainDataAndCallWS(url, callMethod, params);
                    invokerUI.getTxtResult().setText(result);
                    invokerUI.getWsInvoked().setText(wsdlCRUD.findByUrl(url).getString("name"));
                    invokerUI.enableResult(true);
                    invoke = true;
                } catch (Exception e2) {
                    System.err.println(e2);
                }
            }
            if (!invoke) {
                invokerUI.getTxtResult().setText("There is no coincidence with the method and parameters selected");
            }
        } else {
            invokerUI.getTxtResult().setText("There is no coincidence with the method and parameters selected");
        }
    }
}
