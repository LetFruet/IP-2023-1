package Unidade5;
import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inscriçao = 1, soma = 0, total_altura = 0, maior_atleta = 0, menor_atleta = 0;
        double altura = 0, media = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        while(inscriçao != 0) { 
            System.out.print("Escreva o número de inscrição: ");
            inscriçao = teclado.nextInt(); 
        
            if (inscriçao == 0) {
                break; }

            System.out.print("Escreva a altura: ");
            altura = teclado.nextDouble(); 

            total_altura++;
            soma += altura;
            media = soma / total_altura;

            if(altura > maior) {
                maior = altura;
                maior_atleta = inscriçao; }

            if(altura < menor) {
                menor = altura;
                menor_atleta = inscriçao; }
        }

        System.out.println("Número de inscrição do maior atleta: " + maior_atleta + "\n" + "Altura do maior atleta: " + maior);
        System.out.println("Número de inscrição do menor atleta: " + menor_atleta + "\n" + "Altura do menor atleta: " + menor);
        System.out.println("Média geral da altura: " + media);

        teclado.close();
    }
}