package Unidade5;
import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Entre com um número 'n': ");
        int n = teclado.nextInt();  

        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Entre com um número real: ");
            int real = teclado.nextInt();  

            if (real > maior) {
                maior = real; }

            if (real < menor) {
                menor = real; } 
        }  
    
        System.out.println("Número maior: " + maior);
        System.out.println("Número menor: " + menor);

        teclado.close();
    }
}
