package Unidade2;

import java.util.Scanner;

public class Uni2Exe04 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Informe a nota 1");
    double nota1 = teclado.nextDouble();
    if (nota1 < 0 || nota1 > 10)
       while (nota1 < 0 || nota1 > 10) {
        System.out.println("Infoorme uma nota entre 0 e 10");
        nota1 = teclado.nextDouble();
       }
       System.out.println("Informe a nota 2");
       double nota2 = teclado.nextDouble();
       if (nota2 < 0 || nota2 > 10)
          while (nota2 < 0 || nota2 > 10) {
           System.out.println("Infoorme uma nota entre 0 e 10");
           nota2 = teclado.nextDouble();
          }

    // Processo
    double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

    // Saída
    System.out.println("A média ponderada calculada é: " + media);
    teclado.close();
  }
}

/*INICIO
Leia(Nota1)
Se (Nota1 < 0) ou (Nota1 > 10)
   Enquanto (Nota1 < 0) ou (Nota1 > 10) Faça
	   Escreva("A nota deve estar entre 0 e 10.")
      Leia(Nota1)
Leia(Nota2)
Se (Nota2 < 0) ou (Nota2 > 10)
   Enquanto (Nota2 < 0) ou (Nota2 > 10) Faça
	   Escreva("A nota deve estar entre 0 e 10.")
      Leia(Nota2)
Media = ((Nota1 * 3.5) + (Nota2 * 7.5)) / 11
Escreva("A média ponderada calculada é: " + Media)
FIM*/