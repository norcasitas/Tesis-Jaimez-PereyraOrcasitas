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
    private CategoryCRUD categoryCRUD; 
    private WsdlCRUD wsdlCRUD; 
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
     * this method loads categories into the gui
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
             * The invocation served to the user, calculates the new reputation.
             */
            Wsdl wsdl = wsdlCRUD.findByName(invokerUI.getWsInvoked().getText());
            wsdlCRUD.editReputation(wsdl, true);
            invokerUI.enableResult(false);
        }
        if (e.getSource() == invokerUI.getBtnNo()) {
            /**
             * The invocation not served to the user, calculates the new reputation.
             */
            Wsdl wsdl = wsdlCRUD.findByName(invokerUI.getWsInvoked().getText());
            wsdlCRUD.editReputation(wsdl, false);
            invokerUI.enableResult(false);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        /**
         * enables parameters based on how many the user wants 
         */
        invokerUI.enableParams(Integer.valueOf((String) e.getItem()));
    }

    /**
     * obtains the information from the gui, and returns a requestModel
     *
     * @return
     */
    private RequestModel getDataFromUI() {
        //(*-)creates a request model
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
             * (for all chosen parameters, it gets the type and value and casting it
             * if the cast fails it'll return null
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
                 * the conversion of one type failed, returns null
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
     * Take the path of a wsdl.ecore file and a request,
     * it compares models and if included, returns the matched names
     *
     * @param pathWsdl wsdlRequest.ecore path
     * @param request user request 
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
     * get all method names and url that matches with the user request
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
                     * Transform and compare each wsdl of the chosen category,
                     * if it is included it'll return the names of the matched methods.
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
     * invoke the best matched wsdl, if the invocation fails, call the next.
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
