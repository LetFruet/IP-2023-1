package Unidade5;
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m, n, k, soma_mochila = 0, soma_fora = 0;
        String elementos_mochila = "", elementos_fora = "";

        System.out.print("Digite o valor inicial positivo para a decomposição: ");
        n = teclado.nextInt();
        System.out.print("Digite o valor do decremento: ");
        k = teclado.nextInt();
        System.out.print("Digite o tamanho da mochila: ");
        m = teclado.nextInt();

        while (n > 0) {
            if (m > soma_mochila + n) {
                elementos_mochila += n + " ";
                soma_mochila += n;
                
                n -= k; }
                
                else {
                    elementos_fora += n + " ";
                    soma_fora += n;

                    n -= k; } 
        }

        System.out.println("Elementos a serem colocados na mochila " + elementos_mochila);
        System.out.println("Soma mochila " + soma_mochila);
        System.out.println("Fora mochila " + elementos_fora);
        System.out.println("Soma fora " + soma_fora);

        teclado.close();
    }
}