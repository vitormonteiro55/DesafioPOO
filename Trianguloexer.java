package triangulo;

import java.util.Scanner;

public class TrianguloExec {

	public static void main(String[] args) {
		double x, y, z;
		double area, perimetro;
		String tipo;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 2; i++) {
			System.out.printf("Digite os lados do %do triângulo:\n", i);
			
			System.out.print("X: ");
			x = sc.nextDouble();
			System.out.print("Y: ");
			y = sc.nextDouble();
			System.out.print("Z: ");
			z = sc.nextDouble();
			
			if (Math.abs(x - y) < z && z < Math.abs(x + y)) {
				if (x == y && y == z)
					tipo = "Equilátero";
				else if (x == y || x == z || y == z)
					tipo = "Isóceles";
				else
					tipo = "Escaleno";
			} else {
				System.out.println("Isso ai não é um triângulo parça");
				continue;
			}
			
			perimetro = (x + y + z) / 2.0;
			area = Math.sqrt(
				perimetro * 
				(perimetro - x) *
				(perimetro - y) *
				(perimetro - y)
			);
			
			System.out.printf("Os lados x:%.1f, y:%.1f, z:%.1f formam um triângulo %s\n", x, y, z, tipo);
			System.out.printf("Com perímetro: %.2f\n", perimetro);
			System.out.printf("E área: %.2f\n", area);
		}
		
		sc.close();
	}

}