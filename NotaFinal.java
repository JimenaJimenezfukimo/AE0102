package datos;
public class NotaFinal {
    private double teoria;
    private double practica;
    private double examenFinal;
    public void setTeoria(double t) {
        if (t >= 0 && t <= 20) {
            teoria=t;
        } else {
            System.out.println("Nota de teoría inválida debe de ser entre 0 y 20");
            teoria=0;
        }
    }
    public double getTeoria() {
        return teoria;
    }
    public void setPractica(double p) {
        if (p >= 0 && p <= 20) {
            practica = p;
        } else {
            System.out.println("Nota de práctica inválida debe de ser entre 0 y 20");
            practica=0;
        }
    }
    public double getPractica() {
        return practica;
    }
    public void setExamenFinal(double e) {
        if (e >= 0 && e <= 20) {
            examenFinal = e;
        } else {
            System.out.println("nota de examen final inválida debe de ser entre 0 y 20");
            examenFinal = 0;
        }
    }
    public double getExamenFinal() {
        return examenFinal;
    }
    public double calcularPromedioFinal() {
        return (teoria * 0.30) + (practica * 0.40) + (examenFinal * 0.30);
    }
}