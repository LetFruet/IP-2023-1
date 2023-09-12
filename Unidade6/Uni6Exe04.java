package Unidade6;
import java.util.Scanner;

public class Uni6Exe04 {    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // i = índice do vetor

        int vetor1[] = lerVetor1(teclado);
        int vetor2[] = lerVetor2(teclado);
        int vetor3[] = somarVetor(vetor1, vetor2);
        imprimirValor(vetor1, vetor2, vetor3);

        teclado.close();
    }
    
    public static int[] lerVetor1(Scanner teclado) {
        
        int vetor1[] = new int[10];

        System.out.println("Entre com 10 valores inteiros para o vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = teclado.nextInt();
        }

        return vetor1;
    }
    
    public static int[] lerVetor2(Scanner teclado) {

        int vetor2[] = new int[10];

        System.out.println("Entre com 10 valores inteiros para o: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = teclado.nextInt();
        }

        return vetor2;
    }

    public static int[] somarVetor(int vetor1[], int vetor2[]) {
        
        int somaVetor[] = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            somaVetor[i] = vetor1[i] + vetor2[i];
        }
        
        return somaVetor;
    }
    
    public static void imprimirValor(int vetor1[], int vetor2[], int vetor3[]) {
           
        System.out.println();
        System.out.print("Vetor1  = [ ");
        for (int i = 0; i < vetor1.length; i++) {
            if (i < vetor1.length - 1) {
            System.out.print(vetor1[i] + ", "); }
            else {
                System.out.print(vetor1[i] + " ]"); }
        }

        System.out.println();
        System.out.print("Vetor2  = [ ");
        for (int i = 0; i < vetor2.length; i++) {
            if (i < vetor1.length - 1) {
            System.out.print(vetor2[i] + ", "); }
            else {
                System.out.print(vetor2[i] + " ]"); }
        }
         
        System.out.println();
        System.out.print("Vetor3  = [ ");
        for (int i = 0; i < vetor3.length; i++) {
            if (i < vetor1.length - 1) {
            System.out.print(vetor3[i] + ", "); }
            else {
                System.out.print(vetor3[i] + " ]"); }
        }
    }
}
