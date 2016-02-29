/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jjaimez
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "frasedeldia")
    public String frasedeldia() {
        
        return "Lo pasado ha huido, lo que esperas está ausente, pero el presente es tuyo.";
    }
}
