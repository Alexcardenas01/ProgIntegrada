package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "SumarCompleto")
public class SumarCompleto {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumaFinal")
    public float sumaFinal(@WebParam(name = "ivaFinal") float ivaFinal, @WebParam(name = "sumaTotal") float sumaTotal) {
        return ivaFinal + sumaTotal;
    }

}