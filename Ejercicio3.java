package vista;
import java.util.Scanner;
import datos.Descuento;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Descuento d= new Descuento();
        System.out.println("Ingrese el monto total de sus productos: ");
        d.montoTotal = s.nextDouble();
        System.out.println("El monto total a pagar con descuento es: "+ d.calcularPago());
        s.close();
    }
}