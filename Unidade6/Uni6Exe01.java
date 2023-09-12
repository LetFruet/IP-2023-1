package Unidade6;
import java.util.Scanner;

public class Uni6Exe01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n[] = new int[10];     

        System.out.println("Entre com 10 valores inteiros: ");

        for (int i = 0; i < 10; i++) {
            n[i] = teclado.nextInt();
        }
          
        inverterVetor(n);
        imprimirVetor(n);
 
        teclado.close();
    }
 
    public static void inverterVetor(int[] vetor) {

        int tamanho = vetor.length;

        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
    }
 
    public static void imprimirVetor(int[] vetor) {
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
    }
}