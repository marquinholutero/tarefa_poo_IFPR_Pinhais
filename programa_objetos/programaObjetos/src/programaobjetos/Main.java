
package programaobjetos;
import java.util.Scanner;
import java.util.Locale;
import entities.Grafico;


public class Main {

	public static void main(String[] args) {

		Grafico linha = new Grafico();
		Grafico triangulo = new Grafico();
		Grafico quadrado = new Grafico();

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha o Caculo Desejado:");
		System.out.println("1 - Calculo do Tamanho da  Linha");
		System.out.println("2 - Calculo da Area do Triangulo");
		System.out.println("3 - Calculo da Area do Retangulo");
		System.out.println("");
		System.out.print("Digite aqui sua opcao:  ");

		String opcao = ler.nextLine();
		int opc = Integer.parseInt(opcao);

		do {
			if (opc == 1) {
				System.out.println("");
				System.out.print("Digite o Ponto 1: ");
				linha.a = ler.nextInt();
				System.out.print("Digite o Ponto 2: ");
				linha.b = ler.nextInt();
				linha.tamanhoLinha();
				ler.close();
				break;

			} else if (opc == 2) {

				System.out.println("");
				System.out.print("Digite Aresta A: ");
				triangulo.a = ler.nextDouble();
				System.out.print("Digite Aresta B: ");
				triangulo.b = ler.nextDouble();
				System.out.print("Digite Aresta C: ");
				triangulo.c = ler.nextDouble();
				triangulo.areaTriangulo();
				ler.close();
				break;

			} else if (opc == 3) {

				System.out.println("");
				System.out.print("Digite a Base: ");
				quadrado.a = ler.nextDouble();
                System.out.print("Digite a Altura: ");
				quadrado.b = ler.nextDouble();
				quadrado.areaQuadrado();
				ler.close();

			} else {
				System.out.print("OPCAO INCORRETA!INSIRA VALOR DENTRE AS OPCOES ACIMA!");
				break;

			}

		} while (false);

	}
	

}