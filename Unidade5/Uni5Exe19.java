package Unidade5;
import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double compra = 1, total = 0, recebimento = 0;

        while(compra != 0) { 
            System.out.print("Informe o valor da compra: ");
            compra = teclado.nextInt(); 
            
            if (compra == 0) {
                break; }

            if(compra > 500) {
                total = compra * 0.80; 
                System.out.println("Valor total a pagar: " + total); 
                recebimento += total; }

            if(compra <= 500) {
                total = compra * 0.85; 
                System.out.println("Valor total a pagar: " + total); 
                recebimento += total; } 
        }

        System.out.println("Valor total recebido pela loja: " + recebimento); 

        teclado.close();
    }
}