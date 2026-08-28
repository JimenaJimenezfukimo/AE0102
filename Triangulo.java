package datos;

public class Triangulo {
	public double base;
	public double altura;
	
	public double calcular_area() {
		double area;
		area = (base * altura) / 2;
		return area;
	}

}
