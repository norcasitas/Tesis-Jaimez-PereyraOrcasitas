package tesis.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
    }

    private void loadCategories() {
        DataBase.openDataBase();
        categories = categoryCRUD.getAllCategories();
        for (Category c : categories) {
            invokerUI.getSpnCategory().addItem(c.get("name"));
        }
        invokerUI.getBtnSearchInvoke().setEnabled(invokerUI.getSpnCategory().getItemCount() != 0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        RequestModel request = getDataFromUI();
        Utils.exportRequestModeltoXMI(request);
        DataBase.openDataBase();
        if (e.getSource() == invokerUI.getBtnSearchInvoke()) {
            //va transformando y si machea, lo invoca, sino llama la que sigue hasta 
            //agosta las posibilidades

            List<Wsdl> wsdls = categoryCRUD.getChilds(categories.get(invokerUI.getSpnCategory().getSelectedIndex()));
            ArrayList<Pair<String, String>> methods = new ArrayList<>();//tengo (url,method)
            for (Wsdl wsdl : wsdls) {
                try {
                    String url = wsdl.getString("url");
                    String nameDefinition = new T2Mwsdl().transformT2M(url);
                    String outputPath = Utils.getAbsolutePathRunning() + "/folder_outputs/" + nameDefinition + ".xmi";
                    new Transformation().startTransformation(Utils.getAbsolutePathRunning() + "/folder_outputs/" + nameDefinition + ".xmi", outputPath);
                    for (String methodName : comparsion(outputPath, request)) {
                        methods.add(new Pair<>(url, methodName));

                    }
                    //aca en methods tengo todos los metodos que machean con la request
                } catch (MalformedURLException ex) {
                    Logger.getLogger(InvokerController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(InvokerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //ahora debo quedarme con el mejor metodo de los que machean
            if (methods.size() > 0) {
                //llamo el primer metodo que macheo
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
                    }
                }
            }
            invokerUI.getTxtResult().setText("There was no coincidence with the method and parameters selected");
        }

        if (e.getSource() == invokerUI.getBtnYes()) {
            wsdlCRUD.editReputation(wsdlCRUD.findByName(invokerUI.getWsInvoked().getText()), true);
        }
        if (e.getSource() == invokerUI.getBtnNo()) {
            wsdlCRUD.editReputation(wsdlCRUD.findByName(invokerUI.getWsInvoked().getText()), false);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        invokerUI.enableParams(Integer.valueOf((String) e.getItem()));
    }

    /**
     * Return true if the url is a local file and exists if a url web then
     * return false
     *
     * @param url
     * @return
     */
    private boolean isLocalFileAndExists(String url) {
        try {
            new URL(url);
        } catch (java.net.MalformedURLException ex) {
            return new File(url).exists();
        }
        return false;
    }

    private RequestModel getDataFromUI() {
        Category catSelected = categories.get(invokerUI.getSpnCategory().getSelectedIndex());
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

            String type = ((JComboBox) (invokerUI.getPanelParamater(i).getComponent(1))).getSelectedItem().toString();
            String value = StringTreatment.deleteAccent(((JTextField) invokerUI.getPanelParamater(i).getComponent(3)).getText());
            //ACA HAY QUE EVALUAR QUE LOS VALUES SEAN DEL TIPO ELEGIDO
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
            //-----------
            Parameter inputParam = factory.createParameter();
            inputParam.setName("param-" + i);
            inputParam.setType(type);
            method.getInParameters().add(inputParam);
        }
        requestModel.getMethods().add(method);
        Utils.exportRequestModeltoXMI(requestModel);
        return requestModel;
    }

    private ArrayList<String> comparsion(String pathWsdl, RequestModel request) throws IOException {
        Comparsion comparsion = new Comparsion();
        comparsion.setRequestModelWSDL((RequestModel) Utils.getFromXMI(pathWsdl).get(0));
        ArrayList<String> operations = comparsion.getMachOperations(request);
        return operations;
    }
}
