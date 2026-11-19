
public class DescuentoEstacional implements PoliticaDescuento {

    @Override
    public double calcularDescuento(double montoOriginal) {
        return montoOriginal * 0.20;
    }
}
