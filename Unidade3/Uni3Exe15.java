package Unidade3;
import java.util.Scanner;

public class Uni3Exe15 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe um número inteiro com 3 dígitos: ");
    int dig = teclado.nextInt();   
if (dig < 100 || dig > 999)
       while (dig < 100 || dig > 999) {
        System.out.println("Informação incorreta, informe um número inteiro com 3 dígitos");
        dig = teclado.nextInt();
       }

    // Processo
       int cent=dig/100;
       int dez=(dig%100)/10;
       int un=(dig%100)%10;

    // Saída
    System.out.println((cent)+ " Centena(s)");
    System.out.println((dez)+ " Dezena(s)");
    System.out.println((un)+ " Unidade(s)");

    teclado.close();
  }
}

