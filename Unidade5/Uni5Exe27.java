package Unidade5;
import java.util.Scanner;

public class Uni5Exe27 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double salario = 0;
		int total_pecas = 0, maior_prod = 0, novo_fun = 1; 

		while (novo_fun == 1) {
			System.out.print("Informe o dia: ");
			int dia = teclado.nextInt();

			while (dia < 1 || dia > 30) {
				System.out.print("Dia invalido, informe o dia novamente: ");
				dia = teclado.nextInt(); }

				System.out.print("Informe o total de peças produzidas no turno da manhã: ");
				int pecas_manha = teclado.nextInt();

				System.out.print("Informe o total de peças produzidas no turno da tarde: ");
				int pecas_tarde = teclado.nextInt();

				total_pecas = pecas_manha + pecas_tarde;

				if (dia >= 1 && dia <= 15) {
					if (total_pecas > 100 && pecas_manha > 30 && pecas_tarde > 30) {
						salario = total_pecas * 0.80;
						System.out.println("Valor recebido: R$ " + salario); }
					else {
						salario = total_pecas * 0.5;
						System.out.println("Valor recebido: R$ " + salario); } }

				if (dia >= 16 && dia <= 30) {
					double salario_manha = pecas_manha * 0.40;
					double salario_tarde = pecas_tarde * 0.30;
					salario = salario_manha + salario_tarde;
					System.out.println("Valor recebido: R$ " + salario); }

				if (total_pecas > maior_prod) {
					maior_prod = dia; }

				if (pecas_manha > pecas_tarde) {
					System.out.println("O funcionário produziu mais no turno da manhã" + "\n" + "Produziu: " + pecas_manha + " peças"); }

				if (pecas_manha < pecas_tarde) {
					System.out.println("O funcionário produziu mais no turno da tarde" + "\n" + "Produziu: " + pecas_tarde + " peças"); } 
			
			System.out.print("Novo funcionário? 1-sim, 2-não: "); 												
			novo_fun = teclado.nextInt();
		}
		
		teclado.close();
	}
}