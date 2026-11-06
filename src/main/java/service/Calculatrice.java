package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(
        serviceName = "CalculatriceService",
        portName = "CalculatricePort",
        targetNamespace = "http://service/",
        endpointInterface = "service.ICalculatrice")
public class Calculatrice implements ICalculatrice {

    @Override
    @WebMethod(operationName = "somme")
    public double somme(int a, int  b) {
        return a + b;
    }

    @Override
    @WebMethod(operationName = "soustraction")
    public double soustraction(int a, int  b) {
        return a - b;
    }

    @Override
    @WebMethod(operationName = "multiplication")
    public double multiplication(int a, int  b) {
        return a * b;
    }

    @Override
    @WebMethod(operationName = "division")
    public double division(int a, int  b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return a / b;
    }
}