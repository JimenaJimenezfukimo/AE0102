package datos;
public class Circulo {
    public double radio;
    public Circulo(double r) {
        radio=r;
    }
    public double calcularArea() {
        return Math.PI*radio*radio;
    }
}