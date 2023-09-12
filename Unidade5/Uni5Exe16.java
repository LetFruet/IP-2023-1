package Unidade5;
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int total = 0, totalF = 0;
        double somaF = 0, soma_geral = 0, mediaF = 0, media_geral = 0, altura = 1;

        while(altura != 0) { 
            System.out.print("Escreva a altura: ");
            altura = teclado.nextDouble(); 

                if (altura == 0) {
                break; }

            System.out.print("Escreva o sexo (F: feminino e M: masculino): ");
            String sexo = teclado.next().toUpperCase(); 
    
            total++;

            soma_geral += altura;

            if (sexo.equals("F")) {
                somaF += altura;
                totalF++;
                mediaF = somaF / totalF; }
            else {
                media_geral = soma_geral / total; }
        } 
    
        System.out.println("Média da altura das mulheres: " + mediaF);
        System.out.println("Média de altura geral: " + media_geral);

        teclado.close();
    }
}