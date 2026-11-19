
public class DescuentoLealtad implements PoliticaDescuento {

    @Override
    public double calcularDescuento(double montoOriginal) {
        return montoOriginal * 0.10;
    }
}
