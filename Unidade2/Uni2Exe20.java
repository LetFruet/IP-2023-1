package Unidade2;

import java.util.Scanner;
public class Uni2Exe20 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe um número par de dobras: ");
    double dobras = teclado.nextInt ();   

    // Processo
        int quadrados= (int) (dobras*2);

    // Saída
    System.out.println("O número de quadrados vistos após desdobrar o papel é: " +(quadrados));

    teclado.close();
  }
}
