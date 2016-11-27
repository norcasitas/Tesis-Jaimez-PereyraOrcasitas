/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.jws.WebService;

/**
 *
 * @author nico
 */
@WebService(serviceName = "Calculator", portName = "ICalculator", endpointInterface = "com.parasoft.wsdl.calculator.ICalculator", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", wsdlLocation = "WEB-INF/wsdl/calculator/calculator.wsdl")
public class calculator {

    public float add(float x, float y) {
        //TODO implement this method
        return x+y;
    }

    public float divide(float numerator, float denominator) {
        //TODO implement this method
        return numerator/denominator;
    }

    public float multiply(float x, float y) {
        //TODO implement this method
        return x*y;
    }

    public float subtract(float x, float y) {
        //TODO implement this method
        return x-y;
    }
    
}
