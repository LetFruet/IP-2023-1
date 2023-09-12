package Prova2;
import java.util.Scanner;
import java.util.Arrays;

public class LeticiaFruet_2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        System.out.println("Entre com um valor inteiro para os vetores: ");
        int N = teclado.nextInt();
                
        double vetor1[] = new double[N];
        double vetor2[] = new double[N];
        double somaVetor[] = new double[N];

        lerVetores(teclado, vetor1, vetor2);
        somarVetor(vetor1, vetor2, somaVetor);
        ordenarVetor(somaVetor);
        imprimirVetor(somaVetor);

        teclado.close();
    }

    public static void lerVetores(Scanner teclado, double vetor1[], double vetor2[]) {

        System.out.println("Entre com N valores reais para popular o vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = teclado.nextDouble(); 
        }
        
        System.out.println("Entre com N valores reais para popular o vetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = teclado.nextDouble(); 
        }
    }

    public static double[] somarVetor(double vetor1[], double vetor2[], double somaVetor[]) {
        
        for (int i = 0; i < vetor1.length; i++) {
            somaVetor[i] = vetor1[i] + vetor2[i];
        }
        
        System.out.print("Vetor origem: [ ");
            for (int i = 0; i < somaVetor.length; i++) {
                if (i < somaVetor.length - 1) {
                System.out.print(somaVetor[i] + " , "); }
                else {
                    System.out.print(somaVetor[i] + " ]"); }
            }

        return somaVetor;
    }
    
    public static double[] ordenarVetor(double somaVetor[]) {

        Arrays.sort(somaVetor);
        
        return somaVetor;
    }
            
    public static void imprimirVetor(double somaVetor[]) {
        System.out.println();
        System.out.print("Vetor ordenado: [ ");
            for (int i = 0; i < somaVetor.length; i++) {
                if (i < somaVetor.length - 1) {
                System.out.print(somaVetor[i] + " , "); }
                else {
                    System.out.print(somaVetor[i] + " ]"); }
            }
    }
}