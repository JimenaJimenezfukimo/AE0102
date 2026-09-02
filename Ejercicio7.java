package vista;

import java.util.Scanner;
import datos.Producto;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Producto p = new Producto();
        System.out.println("ingrese código del producto: ");
        p.setCodigo(s.next());
        System.out.println("ingrese descripcion del producto: ");
        p.setDescripcion(s.next());
        System.out.println("Ingrese cantidad: ");
        p.setCantidad(s.nextInt());
        System.out.println("ingrese precio unitario: ");
        p.setPrecioUnitario(s.nextDouble());
        System.out.println("=== RESUMEN DEL PRODUCTO ===");
        System.out.println("Codigo: " +p.getCodigo());
        System.out.println("Descripcion: " +p.getDescripcion());
        System.out.println("Cantidad: " +p.getCantidad());
        System.out.println("Precio unitario: " +p.getPrecioUnitario());
        System.out.println("precio total: " +p.calcularPrecioTotal());
        System.out.println("IGV (18%): " +p.calcularIGV());
        System.out.println("total a pagar: " +p.calcularTotal());
        s.close();
    }
}