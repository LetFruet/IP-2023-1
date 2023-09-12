package Unidade2;

import java.util.Scanner;

public class Uni2Exe10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe os segundos do evento: ");
    int seg_evento= teclado.nextInt();
   
    // Processo
        int hora=seg_evento/3600;
        int minuto=(seg_evento%3600)/60;
        int segundo=(seg_evento%3600)%60;

    // Saída
    System.out.print((hora) + ":" + (minuto) + ":" + (segundo));

    teclado.close();
  }
}
