package datos;
public class Producto {
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    public void setCodigo(String c) {
        codigo=c;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setDescripcion(String d) {
        descripcion=d;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setCantidad(int c) {
        if (c >= 0) {
            cantidad=c;
        } else {
            System.out.println("cantidad invalida");
            cantidad=0;
        }
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setPrecioUnitario(double p) {
        if (p >= 0) {
            precioUnitario = p;
        } else {
            System.out.println("Precio inválido");
            precioUnitario = 0;
        }
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public double calcularPrecioTotal() {
        return cantidad * precioUnitario;
    }
    public double calcularIGV() {
        return calcularPrecioTotal() * 0.18;
    }
    public double calcularTotal() {
        return calcularPrecioTotal() + calcularIGV();
    }
}