package Unidade2;

import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    // Entrada
    System.out.println("Informe o primeiro número inteiro");
    int numero1 = teclado.nextInt();
    System.out.println("Informe o segundo número inteiro");
    int numero2 = teclado.nextInt();

    // Processo
    int mult = numero1 * numero2;

    // Saída
    System.out.println("A multiplicação é " + mult);
    teclado.close();
  }
}
/*INICIO
Leia(Numero1)
Leia(Numero2)
Mult=Numero1*Numero2
Escrever("A multiplicação é " + Mult)
FIM*/