
public class Main {

    public static void main(String[] args) {

        double montoCompra = 150000;

        // Descuento por lealtad
        PoliticaDescuento lealtad = new DescuentoLealtad();

        CalculadoraPrecios calculadora =
                new CalculadoraPrecios(lealtad);

        System.out.println("DESCUENTO POR LEALTAD");
        calculadora.mostrarDesglose(montoCompra);


        // Descuento estacional
        PoliticaDescuento estacional = new DescuentoEstacional();

        calculadora.setPolitica(estacional);

        System.out.println("DESCUENTO ESTACIONAL");
        calculadora.mostrarDesglose(montoCompra);


        // Descuento por volumen
        PoliticaDescuento volumen = new DescuentoVolumen();

        calculadora.setPolitica(volumen);

        System.out.println("DESCUENTO POR VOLUMEN");
        calculadora.mostrarDesglose(montoCompra);
    }
}
