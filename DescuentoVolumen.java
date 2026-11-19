
public class DescuentoVolumen implements PoliticaDescuento {

    @Override
    public double calcularDescuento(double montoOriginal) {

        if (montoOriginal >= 100000) {
            double descuento = montoOriginal * 0.15;

            return Math.min(descuento, 20000);
        }

        return 0;
    }
}
