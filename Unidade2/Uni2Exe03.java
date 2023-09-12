package Unidade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_4 = new DecimalFormat("0.0000");

    // Entrada
    double pi = 3.14159; // já informado no enunciado
    System.out.println("Informe o valor do raio");
    double raio = teclado.nextDouble();

    // Processo
    //double area = pi * raio * raio;
    double area = pi * Math.pow(raio, 2); // usar Math

    // Saída
    System.out.println("A Área do círculo é " + df_4.format(area));
    teclado.close();
  }
}

/*INICIO
Leia(Raio)                  pi=3.14159
Area=Raio*Raio*3.14159      Area=Raio*Raio*pi
Escrever("A Área do círculo é " + Area)
FIM*/