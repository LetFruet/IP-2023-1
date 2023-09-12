package Unidade6;
import java.util.Scanner;

public class Uni6Exe08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com um valor inteiro menor ou igual a 20 para o vetor N: ");
		int N = teclado.nextInt();

		while (N > 20 || N < 0) { 
			System.out.println(
					"O valor excede o número desejado. \nEntre com um valor inteiro menor ou igual a 20 para o vetor N: ");
			N = teclado.nextInt();
		}

		double vetor[] = new double[N];

		lerValor(vetor, teclado);
		imprimeTabela(vetor); 

		teclado.close();
	}

	public static double[] lerValor(double vetor[], Scanner teclado) {

		System.out.println("Entre com N valores reais para popular o vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextDouble();
		}

		return vetor;
	}

	public static void imprimeTabela(double vetor[]) {

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("[" + vetor[i] + "]" + "\t");
		}

		System.out.println("\n");
		System.out.println("VALOR\tFREQUENCIA");

		double valoresJaImpressos[] = new double[vetor.length]; // Esse vetor serve para sabermos quais valores ja foram
																// printados, caso contrario valores que se repetem
																// seriam printados mais de uma vez

		for (int i = 0; i < vetor.length; i++) {
			int frequencia = 0;
			for (int j = 0; j < vetor.length; j++) { // for que checa a frequencia
				if (vetor[i] == vetor[j]) {
					frequencia++;
				}
			}

			boolean jaImpresso = false;

			for (int j = 0; j < vetor.length; j++) { // for para saber se um valor ja foi printado
				if (vetor[i] == valoresJaImpressos[j]) {
					jaImpresso = true;
				}
			}

			if (!jaImpresso) {
				System.out.println(vetor[i] + "    \t    " + frequencia);
			}

			valoresJaImpressos[i] = vetor[i];

		}

	}
}