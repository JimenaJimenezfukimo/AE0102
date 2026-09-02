package vista;
import java.util.Scanner;
import datos.NotaFinal;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        NotaFinal nf=new NotaFinal();
        System.out.println("Ingrese nota de teoría (0-20): ");
        double t =s.nextDouble();
        nf.setTeoria(t);
        System.out.println("Ingrese nota de práctica(0-20): ");
        double p= s.nextDouble();
        nf.setPractica(p);
        System.out.println("Ingrese nota de examen final(0-20): ");
        double e =s.nextDouble();
        nf.setExamenFinal(e);
        System.out.println("El promedio final es: " +nf.calcularPromedioFinal());
        s.close();
    }
}