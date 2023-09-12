package Unidade6;
import java.util.Scanner;

public class Uni6Exe03 {

    public static void main(String[] args) {

        double vetor[] = new double[12];

		lerValor(vetor);
		ajustarValor(vetor);
		imprimirValor(vetor);
	}

	public static void lerValor(double vetor[]) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com 12 valores reais: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextDouble();
		}

        teclado.close();
	}

	public static void ajustarValor(double vetor[]) {

		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				vetor[i] = vetor[i] + (vetor[i] * 0.02); } 
			else {
				vetor[i] = vetor[i] + (vetor[i] * 0.05);
			}
		}
	}

	public static void imprimirValor(double vetor[]) {
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
 }




