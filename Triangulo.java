package geometria;

public class Triangulo {
	public double x;
	public double y;
	public double z;
	
	public boolean valido() {
		return (Math.abs(x - y) < z && z < Math.abs(x + y));
	}
	
	public String tipo() {
		if (valido()) {
			if (x == y && y == z)
				return "Equilátero";
			else if (x == y || x == z || y == z)
				return "Isóceles";
			else
				return "Escaleno";
		} else {
			return "Inexistente";
		}
	}
	
	public double perimetro() {
		double perimetro = (x + y + z) / 2.0;
		return perimetro;
	}
	
	public double area() {
		double perimetro = perimetro();
		return Math.sqrt(
			perimetro *
			(perimetro - x) *
			(perimetro - y) *
			(perimetro - z)
		);
	}
	
	public String toString() {
		if (valido()) {
			return String.format("Os lados x:%.1f, y:%.1f e z:%.1f formam um triângulo %s de perímetro %.2f e área %.2f", 
					x, y, z,
					tipo(),
					perimetro(),
					area()
					);			
		} else {
			return "O triângulo é inválido!";
		}
	}
}