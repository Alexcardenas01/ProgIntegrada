package beans;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService(name = "PorcentajeWservice")
public class PorcentajeEJB {

    public float calculaIva(float valor, float porcentaje) {
        float resultado;
        resultado = (valor + (valor * (porcentaje/100)));
        return resultado;
    }
    
    @WebMethod(operationName = "hello")
    
    public static void main(String[] args) {
        PorcentajeEJB ctrl = new PorcentajeEJB();
        System.out.println(ctrl.calculaIva(100000, 19));
    }
}
