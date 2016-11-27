package tesis.utils;

import java.io.File;
import org.javalite.activejdbc.Base;
import tesis.crud.CategoryCRUD;
import tesis.crud.WsdlCRUD;
import tesis.models.Category;
import tesis.models.Wsdl;

public class DataBase {

    private static final String driver = "org.h2.Driver";
    private static final String urlIfExists = "jdbc:h2:" + getAbsolutePathRunning() + "/database/qvtwsinvoker;IFEXISTS=TRUE;";
    private static final String url = "jdbc:h2:" + getAbsolutePathRunning() + "/database/qvtwsinvoker";
    private static final String usr = "tesis";
    private static final String pwd = "tesis";

    private static final String scriptTableCategories = "CREATE TABLE `categories` (`id` INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY, `name` VARCHAR(100) NOT NULL);";
    private static final String scriptTableWsdls = "CREATE  TABLE wsdls (`id` INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY, `name` VARCHAR(100) NOT NULL, `url` VARCHAR(200) NOT NULL, `category_id` INT(11) NOT NULL, `reputation` REAL  DEFAULT 0, `response` REAL  DEFAULT 99999, `availability` REAL DEFAULT 0);";

    /**
     * return absolute jar path
     *
     * @return
     */
    public static String getAbsolutePathRunning() {
        return new File(System.getProperty("user.dir")).getAbsolutePath();
    }

    public static void openDataBase() {
        if (!Base.hasConnection()) {
            try {
                Base.open(driver, urlIfExists, usr, pwd);
            } catch (org.javalite.activejdbc.InitException ex) {
                createDataBase();
            }
        }
    }

    private static void createDataBase() {
        Base.open(driver, url, usr, pwd);
        if (Base.hasConnection()) {
            Base.exec(scriptTableCategories);
            Base.exec(scriptTableWsdls);
            //load web services and categories
            CategoryCRUD categoryCRUD = new CategoryCRUD();
            Category calculator = new Category();
            calculator.set("name", "calculator");
            categoryCRUD.create(calculator);
            Category temperature = new Category();
            temperature.set("name", "temperature");
            categoryCRUD.create(temperature);
            temperature = categoryCRUD.getCategory(temperature);
            calculator = categoryCRUD.getCategory(calculator);
            WsdlCRUD wsdlCrud = new WsdlCRUD();
            Wsdl wsdl = new Wsdl();

            wsdl.set("name", "calculator parasoft");
            wsdl.set("url", "http://ws1.parasoft.com/glue/calculator.wsdl");
            wsdl.set("category_id", calculator.get("id"));
            wsdlCrud.create(wsdl);

            wsdl.set("name", "calculator dneonline");
            wsdl.set("url", "http://www.dneonline.com/calculator.asmx?WSDL");
            wsdl.set("category_id", calculator.get("id"));
            wsdlCrud.create(wsdl);

            wsdl.set("name", "temperature converter daehosting");
            wsdl.set("url", "http://webservices.daehosting.com/services/TemperatureConversions.wso?WSDL");
            wsdl.set("category_id", temperature.get("id"));
            wsdlCrud.create(wsdl);

            wsdl.set("name", "temperature converter w3schools");
            wsdl.set("url", "http://www.w3schools.com/xml/tempconvert.asmx?WSDL");
            wsdl.set("category_id", temperature.get("id"));
            wsdlCrud.create(wsdl);

            wsdl.set("name", "local calculator float");
            wsdl.set("url", "http://localhost:8084/webServicesTesis/Calculator?WSDL");
            wsdl.set("category_id", calculator.get("id"));
            wsdlCrud.create(wsdl);

            wsdl.set("name", "local calculator int");
            wsdl.set("url", "http://localhost:8084/webServicesTesis/Calculator2?WSDL");
            wsdl.set("category_id", calculator.get("id"));
            wsdlCrud.create(wsdl);

            wsdl.set("name", "temperature converter local");
            wsdl.set("url", "http://localhost:8084/webServicesTesis/TempConvert?WSDL");
            wsdl.set("category_id", temperature.get("id"));
            wsdlCrud.create(wsdl);
        }
    }

}
