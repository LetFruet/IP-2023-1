package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe07 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe a quantidade de latas compradas: ");
    double lata = teclado.nextDouble();
    System.out.print("Informe a quantidade de garrafas pequenas compradas (600ml): ");
    double garrafapequena = teclado.nextDouble();
    System.out.print("Informe a quantidade de garrafas grandes compradas (2L): ");
    double garrafagrande = teclado.nextDouble();


    // Processo
    double calculo=(lata*350)+(garrafapequena*600)+(garrafagrande*2000);
    double total=calculo/1000;

    // Saída
    System.out.println("Foram comprados " + df_2.format(total) + " litros");

    teclado.close();
  }
}
