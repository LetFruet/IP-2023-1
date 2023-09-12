package Unidade5;
import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Entre com um valor 'n' maior do que 2: "); 
        int n = teclado.nextInt ();  

        int termo_impar = 4, termo_par = 0; 

        for (int i = 1; i <= n; i++) {
            if (n < 2) {
                System.out.print("Entre com um valor 'n' maior do que 2: "); 
                n = teclado.nextInt (); }

            if (i % 2 == 0) {
                termo_par = termo_impar + 2; 
                System.out.println(termo_par); }
                else {
                    termo_impar *= 2;
                    System.out.println(termo_impar); } 
        } 

        teclado.close();
    }
}
