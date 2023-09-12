package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe05 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o total de fangos: ");
    double frangos = teclado.nextDouble();


    // Processo
    double identificacao = frangos*4;
    double alimentacao = frangos*3.5*2;
    double total = identificacao+alimentacao;

    // Saída
    System.out.println("O gasto total da granja para marcar todos os seus frangos é R$ " + df_2.format(total));

    teclado.close();
  }
}
