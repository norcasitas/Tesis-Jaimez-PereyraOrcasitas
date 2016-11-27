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
@WebService(serviceName = "Calculator2")
public class Calculator2 {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "x") final int x, @WebParam(name = "y") final int y) {
        return x+y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "substract")
    public int substract(@WebParam(name = "x") final int x, @WebParam(name = "y") final int y) {
        //TODO write your implementation code here:
        return x-y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divide")
    public int divide(@WebParam(name = "x") final int x, @WebParam(name = "y") final int y) {
        //TODO write your implementation code here:
        return x/y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiply")
    public int multiply(@WebParam(name = "x") final int x, @WebParam(name = "y") final int y) {
        //TODO write your implementation code here:
        return x*y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pow")
    public double pow(@WebParam(name = "x") final double x, @WebParam(name = "y") final double y) {
        //TODO write your implementation code here:
        return Math.pow(x, y);
    }

}
