package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(name = "PorcentajeWservice")
public class PorcentajeEJB {

    public float calculaIva(float valor, float porcentaje) {
        float resultado;
        resultado = (valor + (valor * porcentaje));
        return resultado;
    }
}
