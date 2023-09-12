package Unidade2;

import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    // Entrada
    System.out.println("Informe o primeiro número inteiro");
    int numero1 = teclado.nextInt();
    System.out.println("Informe o segundo número inteiro");
    int numero2 = teclado.nextInt();

    // Processo
    int soma = numero1 + numero2;

    // Saída
    System.out.println("A soma é " + soma);
    teclado.close();
  }
}
/*INICIO
Leia(Numero1)
Leia(Numero2)
Soma=Numero1+Numero2
Escrever("A soma é " + Soma)
FIM*/
