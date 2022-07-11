package triangulo2;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExec2 {

	public static void main(String[] args) {
		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();
		
		entrada(a);
		System.out.println(a.toString());
		
		entrada(b);
		System.out.println(b.toString());
	}

	public static void entrada(Triangulo triangulo) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores dos lados:");
		triangulo.x = sc.nextDouble();
		triangulo.y = sc.nextDouble();
		triangulo.z = sc.nextDouble();
		
//		sc.close(); // https://stackoverflow.com/a/13042296
	}
}
