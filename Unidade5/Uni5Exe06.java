package Unidade5;
import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        double media = 0, soma = 0; 

        for (double i = 1; i <= 20; i++) {
            System.out.println("Entre com 20 alturas: ");
            double altura = teclado.nextDouble();  

            soma += altura;
            media = soma / i; 
        }
    
        System.out.println(media);

        teclado.close();
    }
}