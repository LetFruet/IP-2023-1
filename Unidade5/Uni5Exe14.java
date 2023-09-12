package Unidade5;
import java.util.Scanner;

public class Uni5Exe14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double PC = 0, PV = 0, totalC = 0, totalV = 0, lucro = 0;
		int porc10 = 0, porc1020 = 0, porc20 = 0;
		String nome = " ";

		for (int mercadoria = 1; mercadoria <= 3; mercadoria++) {

			System.out.print("Entre com o nome da mercadoria: ");
			nome = teclado.next();
			System.out.print("Entre com o preço de compra da mercadoria: ");
			PC = teclado.nextDouble();
			System.out.print("Entre com o preço de venda da mercadoria: ");
			PV = teclado.nextDouble();

			totalC += PC; 
			totalV += PV;
			lucro = totalV - totalC;

			double porc = (PV / PC) - 1;

			if (porc < 10) {
				porc10++;}

			if (porc >= 10 && porc <= 20) {
				porc1020++;}

			if (porc > 20) {
				porc20++; }
		}

		System.out.println(nome);
		System.out.println("Lucro < 10% : " + porc10);
		System.out.println("10% <= lucro <= 20% : " + porc1020);
		System.out.println("Lucro > 20% : " + porc20);
		System.out.println("Total de compras: " + totalC);
		System.out.println("Total de vendas: " + totalV);
		System.out.println("Lucro total: " + lucro);

		teclado.close();
	}
}
