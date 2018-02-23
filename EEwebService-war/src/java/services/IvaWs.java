package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "IvaWs")
@Stateless()
public class IvaWs {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcularIva")
    public float calcularIva(@WebParam(name = "valor") float valor, @WebParam(name = "porcentaje") float porcentaje) {
        float resultado = (valor + (valor * (porcentaje / 100)));
        return resultado;
    }
}
