package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "PorcentajeWservice")
public class PorcentajeWservice {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcularIva")
    public float calcularIva(@WebParam(name = "valor") float valor, @WebParam(name = "porcentaje") float porcentaje) {
        float resultado = (valor+(valor*(porcentaje/100)));
        return resultado;
    }

 

   
}
    