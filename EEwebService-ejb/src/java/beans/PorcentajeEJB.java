package beans;


public class PorcentajeEJB {

    public static void main(String[] args) {
        System.out.println("Método porcentaje: " + calcularIva(100000, 19));
        System.out.println("Método sumar dos productos: " + sumarProductos(40000, 50000));
        System.out.println("Resultado final:  " + sumaFinal(calcularIva(100000, 19),sumarProductos(40000, 50000)));
    }

    private static float calcularIva(float valor, float porcentaje) {
        services.PorcentajeWservice_Service service = new services.PorcentajeWservice_Service();
        services.PorcentajeWservice port = service.getPorcentajeWservicePort();
        return port.calcularIva(valor, porcentaje);
    }

    private static float sumarProductos(float valor1, float valor2) {
        services.SumarProductos_Service service = new services.SumarProductos_Service();
        services.SumarProductos port = service.getSumarProductosPort();
        return port.sumarProductos(valor1, valor2);
    }

    private static float sumaFinal(float ivaFinal, float sumaTotal) {
        services.SumarCompleto_Service service = new services.SumarCompleto_Service();
        services.SumarCompleto port = service.getSumarCompletoPort();
        return port.sumaFinal(ivaFinal, sumaTotal);
    }

   

    

}
