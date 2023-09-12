package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe a temperature em Celcius: ");
    double C = teclado.nextDouble();   

    // Processo
        Double F = (9.0/5.0)*C+32;

    // Saída
    System.out.println("A temperatura em Fahrenheit é: " + df_2.format(F));
    teclado.close();
  }
}

