package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe06 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o peso do prato em kg: ");
    double peso = teclado.nextDouble();


    // Processo
    double calculo=(peso*25)-0.75;

    // Saída
    System.out.println("O valor a pagar é R$ " + df_2.format(calculo));

    teclado.close();
  }
}
