package vista;
import java.util.Scanner;
import datos.Triangulo;
public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Triangulo x= new Triangulo();
		System.out.println("Ingrese la base: ");
		x.base=s.nextDouble();
		System.out.println("Ingrese la altura: ");
		x.altura=s.nextDouble();
		System.out.println("El area del triangulo es: "+x.calcular_area());
		

	}

}
