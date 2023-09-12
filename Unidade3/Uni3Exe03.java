package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o valor do litro do combustível: ");
    double precoporlitro = teclado.nextDouble();
    System.out.print("Informe o valor do pagamento: ");
    double valorpago = teclado.nextDouble();

    //  Processo
    double qtdlitros = valorpago / precoporlitro;
 
    // Saída
    System.out.println("É possível abastecer  " + df_2.format(qtdlitros) + " litros");

    teclado.close();
  }
}
