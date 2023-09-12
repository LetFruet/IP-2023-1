package Unidade3;
import java.util.Scanner;

public class Uni3Exe16 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe o valor total da compra: ");
    int comp = teclado.nextInt();   
    System.out.print("Informe o valor do pagamento: ");
    int pagam = teclado.nextInt();   

    // Processo
        int troco=pagam-comp;

        int nota100=troco/100;
        int nota10=(troco%100)/10;
        int nota1=(troco%100)%10;
        int minimo=nota100+nota10+nota1;

    // Saída
    System.out.println("O número de cédulas a ser devolvido é " + (minimo));
    System.out.println("O número de cédulas de 100 reais a ser devolvido é " + (nota100));
    System.out.println("O número de cédulas de 10 reais a ser devolvido é " + (nota10));
    System.out.println("O número de cédulas de 1 real a ser devolvido é " + (nota1));


    teclado.close();
  }
}
