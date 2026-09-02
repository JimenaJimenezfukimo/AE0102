package vista;
import java.util.Scanner;
import datos.Ahorro;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Ahorro x=new Ahorro();
		System.out.println("Ingrese el monto a ahorrar: ");
		x.monto=s.nextDouble();
		System.out.println("La ganancia mensual es: "+x.obtener_ganancia());
		s.close();
	}
}
