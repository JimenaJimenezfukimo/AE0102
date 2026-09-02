package datos;
public class Triangulo {
    public double catetoA;
    public double catetoB;
    public Triangulo(double a,double b) {
        catetoA = a;
        catetoB = b;
    }
    public double calcularHipotenusa() {
        return Math.sqrt(catetoA*catetoA+catetoB*catetoB);
    }
}