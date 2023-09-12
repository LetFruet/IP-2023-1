package Unidade2;

import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    // Entrada
    System.out.println("Informe valor A");
    int a = teclado.nextInt();
    System.out.println("Informe valor B");
    int b = teclado.nextInt();
    System.out.println("Informe valor C");
    int c = teclado.nextInt();
    System.out.println("Informe valor D");
    int d = teclado.nextInt();

    // Processo
    int diferenca = ((a * b) - (c * d));

    // Saída
    System.out.println("A difertença entre o produto de A e B pelo produto de C e D é " + diferenca);
    teclado.close();
  }
}