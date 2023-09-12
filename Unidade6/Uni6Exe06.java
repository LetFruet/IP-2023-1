package Unidade6;
import java.util.Scanner;

public class Uni6Exe06 {    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double vetor[] = lerVetor(teclado); 

        System.out.println("Informe um valor real: ");
        double valores = teclado.nextDouble();

        System.out.println(retorno(vetor, valores));

        teclado.close();

    }
    
    public static double[] lerVetor(Scanner teclado) {

        System.out.println("Entre com um valor inteiro para o vetor N: ");
        int N = teclado.nextInt();

        double vetor[] = new double[N];

        System.out.println("Entre com N valores reais para popular o vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble(); 
        }
                    
        return vetor;
    }
    
    public static boolean retorno(double vetor[], double valores) {

        boolean igual = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valores) {
                igual = true; }
            }
            
    return igual;
    }
}