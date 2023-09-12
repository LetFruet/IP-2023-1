package Unidade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o valor de A: ");
    double valA= teclado.nextDouble();
    System.out.print("Informe o valor de B: ");
    double valB= teclado.nextDouble();
    System.out.print("Informe o valor de C: ");
    double valC = teclado.nextDouble();   
    double pi = 3.14159; // já informado no enunciado;

    // Processo
        double tri = (valA*valC/2);  
        double circ = (pi*valC*valC);
        double trap = ((valA+valB)*valC)/2;
        double quad = valB*valB;
        double ret = valA*valB;

    // Saída
    System.out.println("A área do triângulo é: " + df_2.format(tri));
    System.out.println("A área do círculo é: " + df_2.format(circ));
    System.out.println("A área do trapézio é: " + df_2.format(trap));
    System.out.println("A área do quadrado é: " + df_2.format(quad));
    System.out.println("A área do retângulo é: " + df_2.format(ret));

    teclado.close();
  }
}