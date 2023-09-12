package Unidade5;
import java.util.Scanner;

public class Uni5Exe31 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double n = 0, fator = 2;

		System.out.print("Informe o valor inteiro n: ");
		n = teclado.nextDouble();

		while (n > 1) {
			if (fator == 2 || fator == 3 || fator == 5 || fator == 7 || (fator % 2 != 0 && fator % 3 != 0 && fator % 5 != 0 && fator % 7 != 0)) {
				if (n % fator == 0) {
					System.out.println(n + "/" + fator);
					n = n / fator;
					fator = 2; } 
                else {
					fator++; } }
            else {
				fator++; }
		}

		System.out.println("Numero: 1");

		teclado.close();
	}
}