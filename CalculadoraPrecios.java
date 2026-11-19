
public class CalculadoraPrecios {

    private PoliticaDescuento politica;

    public CalculadoraPrecios(PoliticaDescuento politica) {
        this.politica = politica;
    }

    public void setPolitica(PoliticaDescuento politica) {
        this.politica = politica;
    }

    public double calcularAhorro(double montoOriginal) {
        return politica.calcularDescuento(montoOriginal);
    }

    public double calcularPrecioFinal(double montoOriginal) {
        double descuento = calcularAhorro(montoOriginal);

        return montoOriginal - descuento;
    }

    public void mostrarDesglose(double montoOriginal) {

        double descuento = calcularAhorro(montoOriginal);
        double precioFinal = montoOriginal - descuento;

        System.out.println("Monto original: $" + montoOriginal);
        System.out.println("Ahorro obtenido: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("--------------------------------");
    }
}
