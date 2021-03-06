package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "SumarProductos")
public class SumarProductos {

    /**
     * Web service operation
     * @param valor1
     * @param valor2
     * @return 
     */
    @WebMethod(operationName = "sumarProductos")
    public float sumarProductos(@WebParam(name = "valor1") float valor1, @WebParam(name = "valor2") float valor2) {
        return valor1 + valor2;
    }

  
}
