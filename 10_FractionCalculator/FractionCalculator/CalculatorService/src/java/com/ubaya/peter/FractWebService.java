/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubaya.peter;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author bodyflicker
 */
@WebService(serviceName = "FractWebService")
public class FractWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Add")
    public String Add(@WebParam(name = "num1") int num1, @WebParam(name = "den1") int den1, @WebParam(name = "num2") int num2, @WebParam(name = "den2") int den2) {

        int simplifier = 0;
        int numResult = (num1 * den2) + (num2 * den1);
        int denResult = den1 * den2;

        // Mencari nilai terkecil
        if (numResult > denResult) {
            simplifier = denResult;
        } else {
            simplifier = numResult;
        }

        if (simplifier == 0) {
            numResult = 0;
            denResult = 0;
        } else {
            // Mencari FPB
            if (simplifier > 0) {
                while (numResult % simplifier != 0 || denResult % simplifier != 0) {
                    simplifier--;
                }
            } else {
                while (numResult % simplifier != 0 || denResult % simplifier != 0) {
                    simplifier++;
                }
            }
            numResult /= simplifier;
            denResult /= simplifier;
        }

        return (numResult + "/" + denResult);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Substract")
    public String Substract(@WebParam(name = "num1") int num1, @WebParam(name = "den1") int den1, @WebParam(name = "num2") int num2, @WebParam(name = "den2") int den2) {

        int simplifier = 0;
        int numResult = (num1 * den2) - (num2 * den1);
        int denResult = den1 * den2;

        // Mencari nilai terkecil
        if (numResult > denResult) {
            simplifier = denResult;
        } else {
            simplifier = numResult;
        }

        if (simplifier == 0) {
            numResult = 0;
            denResult = 0;
        } else {
            // Mencari FPB
            if (simplifier > 0) {
                while (numResult % simplifier != 0 || denResult % simplifier != 0) {
                    simplifier--;
                }
            } else {
                while (numResult % simplifier != 0 || denResult % simplifier != 0) {
                    simplifier++;
                }
            }
            numResult /= simplifier;
            denResult /= simplifier;
        }

        return (numResult + "/" + denResult);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiply")
    public String Multiply(@WebParam(name = "num1") int num1, @WebParam(name = "den1") int den1, @WebParam(name = "num2") int num2, @WebParam(name = "den2") int den2) {

        int simplifier = 0;
        int numResult = num1 * num2;
        int denResult = den1 * den2;

        // Mencari nilai terkecil
        if (numResult > denResult) {
            simplifier = denResult;
        } else {
            simplifier = numResult;
        }

        if (simplifier == 0) {
            numResult = 0;
            denResult = 0;
        } else {
            // Mencari FPB
            if (simplifier > 0) {
                while (numResult % simplifier != 0 || denResult % simplifier != 0) {
                    simplifier--;
                }
            } else {
                while (numResult % simplifier != 0 || denResult % simplifier != 0) {
                    simplifier++;
                }
            }
            numResult /= simplifier;
            denResult /= simplifier;
        }

        return (numResult + "/" + denResult);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Division")
    public String Division(@WebParam(name = "num1") int num1, @WebParam(name = "den1") int den1, @WebParam(name = "num2") int num2, @WebParam(name = "den2") int den2) {

        int simplifier = 0;
        int numResult = num1 * den2;
        int denResult = den1 * num2;

        // Mencari nilai terkecil 
        if (numResult > denResult) {
            simplifier = denResult;
        } else {
            simplifier = numResult;
        }

        if (simplifier == 0) {
            numResult = 0;
            denResult = 0;
        } else {
            // Mencari FPB
            if (simplifier > 0) {
               while (numResult % simplifier != 0 || denResult % simplifier != 0) {
                    simplifier--;
                }
            } else {
                while (numResult % simplifier != 0 || denResult % simplifier != 0) {
                    simplifier++;
                }
            }
            numResult /= simplifier;
            denResult /= simplifier;
        }

        return (numResult + "/" + denResult);
    }
}
