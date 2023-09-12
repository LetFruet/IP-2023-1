package Unidade6;
import java.util.Scanner;

public class Uni6Exe07 {    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro menor ou igual a 20 para o vetor N: ");
        int N = teclado.nextInt();

        if (N > 20) {
            System.out.println("O valor excede o número desejado. \nEntre com um valor inteiro menor ou igual a 20 para o vetor N: ");
            N = teclado.nextInt(); }

        int vetor[] = new int[N];

        lerValor(vetor, teclado);
        ordenarVetor(vetor);
        imprimeVetor(vetor);

        teclado.close();
    }
    
    public static int[] lerValor(int vetor[], Scanner teclado) {

        System.out.println("Entre com N valores inteiros para popular o vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            int valor = teclado.nextInt(); 

            boolean existe = false;
            
            for (int j = 0; j < vetor.length; j++) {
                if (valor == vetor[j]) {
                    existe = true;
                    break;
                }
            }

            if (existe == true) {
                System.out.println("O número já está cadastrado. \nDigite outro número: ");
                i--; // Volta uma posição no vetor para repetir a leitura do número
            }
            else {
                vetor[i] = valor;
            }   
        }
        
        System.out.print("Vetor origem: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

        return vetor;
    }
    
    public static int[] ordenarVetor(int vetor[]) {

        int armazenar = 0, i = 0;

        while (i < vetor.length - 1) {    
            if (vetor[i] > vetor[i+1]) {
                armazenar = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = armazenar;
                i = 0; }
            else {
                i += 1;
            }
        }
        return vetor;
    }
            
    public static void imprimeVetor(int vetor[]) {
        System.out.println();
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
    }
}