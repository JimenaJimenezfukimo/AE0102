package vista;
import java.util.Scanner;
import datos.Triangulo;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Ingrese el cateto A: ");
        double a= s.nextDouble();
        System.out.println("Ingrese el cateto B: ");
        double b= s.nextDouble();
        Triangulo t= new Triangulo(a, b);
        System.out.println("La hipotenusa es: "+t.calcularHipotenusa());
        s.close();
    }
}
