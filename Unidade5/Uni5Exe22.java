package Unidade5;
import java.util.Scanner;

public class Uni5Exe22 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double aumento = 1.5;
		int ano = 1996;
		double salario = 2000;

		while (ano <= 1997) {
			salario += salario * (aumento / 100);	
				aumento *= 2;
			ano++;
		}

		System.out.println(salario);

		teclado.close();
	}
}