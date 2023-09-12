package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe08 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o valor em Dólar: ");
    double valdolar= teclado.nextDouble();
    System.out.print("Informe a cotação do Dólar: ");
    double cotacao = teclado.nextDouble();   

    // Processo
        double Mult = (valdolar*cotacao);

    // Saída
    System.out.println("O valor a ser devolvido é: " + df_2.format(Mult));
    teclado.close();
  }
}
