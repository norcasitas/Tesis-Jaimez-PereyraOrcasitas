/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author nico
 */
@WebService(serviceName = "TempConvert")
public class TempConvert {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "celsiusToFahrenheit")
    public String celsiusToFahrenheit(@WebParam(name = "temp") final String temp, @WebParam(name = "wild") final String wild) {
        return Float.valueOf(temp)* (9/5) + 32 + Float.valueOf(wild).toString();
    }
}
