package Unidade5;
import java.util.Scanner;

public class Uni5Exe02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int soma_pares = 0, soma_impares = 0;

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                soma_pares += numero; }
            else {
                soma_impares += numero; } 
        }

        System.out.println(soma_pares + "\n" + soma_impares); 
   
        teclado.close();
    }
}
