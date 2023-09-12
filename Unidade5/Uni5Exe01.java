package Unidade5;
import java.util.Scanner;

public class Uni5Exe01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int numero = 1; numero <= 20; numero++) {
            System.out.println("Entre com 20 valores: ");
            numero = teclado.nextInt ();  

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par"); }
            else {
                System.out.println("O número " + numero + " é ímpar"); } 
        }

        teclado.close();
    }
}
