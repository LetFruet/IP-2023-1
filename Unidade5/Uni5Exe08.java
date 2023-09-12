package Unidade5;
import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Entre com um número 'n': ");
        int n = teclado.nextInt();  

        int negativo = Integer.MIN_VALUE, positivo = 0, soma = 0;
        double media = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Entre com um número inteiro: ");
            int inteiro = teclado.nextInt();  

            if (inteiro > 0) {
                positivo++;
                soma += inteiro;
                media = soma / positivo; }

            if (inteiro < 0) {
                negativo = inteiro; } 
        }
    
        System.out.println("Menor número negativo: " + negativo);
        System.out.println("Média dos números positivos: " + media);

        teclado.close();
    }
}
