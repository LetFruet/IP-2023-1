package Unidade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.0000");

    // Entrada
    System.out.print("Informe o X de A: ");
    double XA= teclado.nextDouble();
    System.out.print("Informe o Y de A: ");
    double YA= teclado.nextDouble();
    System.out.print("Informe o X de B: ");
    double XB = teclado.nextDouble();   
    System.out.print("Informe o Y de B: ");
    double YB = teclado.nextDouble();   


    // Processo
        double distancia= Math.sqrt(((XB-XA)*(XB-XA))+((YB-YA)*(YB-YA)));


    // Saída
    System.out.println("A distância entre os pontos é: " + df_2.format(distancia));

    teclado.close();
  }
}

