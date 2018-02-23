package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "SumaFinalWs")
@Stateless()
public class SumaFinalWs {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumaFinal")
    public float sumaFinal(@WebParam(name = "ivaFinal") float ivaFinal, @WebParam(name = "sumaTotal") float sumaTotal) {
        return ivaFinal + sumaTotal;
    }
}
