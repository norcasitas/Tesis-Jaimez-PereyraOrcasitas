/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.utils;

import java.io.File;
import org.javalite.activejdbc.Base;

public class DataBase {

    private static final String driver = "org.h2.Driver";
    private static final String urlIfExists = "jdbc:h2:" + getAbsolutePathRunning() + "/database/qvtwsinvoker;IFEXISTS=TRUE;";
    private static final String url = "jdbc:h2:" + getAbsolutePathRunning() + "/database/qvtwsinvoker";
    private static final String usr = "tesis";
    private static final String pwd = "tesis";

    private static final String scriptTableCategories = "CREATE TABLE `categories` (`id` INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY, `name` VARCHAR(100) NOT NULL);";
    private static final String scriptTableWsdls = "CREATE  TABLE wsdls (`id` INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY, `name` VARCHAR(100) NOT NULL, `url` VARCHAR(200) NOT NULL, `category_id` INT(11) NOT NULL, `reputation` INT(11)  DEFAULT 0, `response` INT(11)  DEFAULT 99999, `availability` INT(11) DEFAULT 0);";

    /**
     * retorna la path absoluta donde se está corriendo el jar
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
        }
    }

}
