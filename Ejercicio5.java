package vista;
import java.util.Scanner;
import datos.Circulo;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio=s.nextDouble();
        Circulo c=new Circulo(radio);
        System.out.println("El area del círculo es: "+c.calcularArea());
        s.close();
    }
}