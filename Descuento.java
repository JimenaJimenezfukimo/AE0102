package datos;
public class Descuento {
    public double montoTotal;
    public double calcularPago() {
        double descuento = montoTotal*0.15;
        return montoTotal-descuento;
    }
}