package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "ICalculatrice", targetNamespace = "http://service/")
public interface ICalculatrice {

    @WebMethod(operationName = "somme")
    double somme(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

    @WebMethod(operationName = "soustraction")
    double soustraction(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

    @WebMethod(operationName = "multiplication")
    double multiplication(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

    @WebMethod(operationName = "division")
    double division(@WebParam(name = "a") int a, @WebParam(name = "b") int b);
}