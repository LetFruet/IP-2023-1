package Unidade3;
import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    // Entrada
    System.out.println("Informe a largura do terreno");
    double largura = teclado.nextDouble();
    System.out.println("Informe o comprimento do terreno");
    double comprimento = teclado.nextDouble();

    // Processo
    double area = largura * comprimento;

    // Saída
    System.out.println("A área do terreno é " + area);
    teclado.close();
  }
}
