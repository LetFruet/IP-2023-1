package Unidade2;

import java.util.Scanner;

public class Uni2Exe19 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe o valor de B: ");
    int valB = teclado.nextInt();   
    System.out.print("Informe o valor de C: ");
    int valC = teclado.nextInt();   
    System.out.print("Informe o valor de D: ");
    int valD = teclado.nextInt();   

    // Processo
        Double valA= (double) ((valB*valC)/valD);

    // Saída
    System.out.println("O valor de A é: " + (valA));

    teclado.close();
  }
}
