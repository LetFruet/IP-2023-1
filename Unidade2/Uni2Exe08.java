package Unidade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe08 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
     System.out.println("Informe o código da peça 1");
    int codP1= teclado.nextInt();
    System.out.println("Informe o número de peças 1");
    double numeroP1 = teclado.nextDouble();   
    System.out.println("Informe O  valor unitário da peça 1");
    double valorP1 = teclado.nextDouble();   
    System.out.println("Informe o código da peça 2");
    int codP2= teclado.nextInt();
    System.out.println("Informe o número de peças 2");
    double numeroP2 = teclado.nextDouble();   
    System.out.println("Informe O  valor unitário da peça 2");
    double valorP2 = teclado.nextDouble(); 

    // Processo
        double valor = (numeroP1*valorP1)+(numeroP2*valorP2);

    // Saída
    System.out.println(" Código peça 1: " + codP1 + 
                       " Código peça 2: " + codP2 +
                       " Valor a ser pago: " + df_2.format(valor));
    teclado.close();
  }
}