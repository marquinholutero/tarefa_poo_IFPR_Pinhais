
package entities;

public class Grafico {
	public double a;
	public double b;
	public double c;
	double calc;

	public void tamanhoLinha() {
		if (a < b) {
			calc = b - a;
			System.out.println("");
			System.out.printf("A area da Linha e: %.0f%n", calc);
		} else {
			calc = a - b;
			System.out.println("");
			System.out.printf("A area da Linha e: %.0f%n", calc);
		}

	}
	public void areaTriangulo() {
		calc = (a + b + c) / 2.0;
		double area = Math.sqrt(calc * (calc - a) * (calc - b) * (calc - c));
		System.out.println("");
		System.out.printf("A area do Triangulo e: %.2f%n", area);

	}

	public void areaQuadrado() {
		calc = (a * b);
		System.out.println("");
		System.out.printf("A area do Retangulo e: %.0f%n", calc);

	}

}