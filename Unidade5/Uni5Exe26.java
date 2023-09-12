package Unidade5;
import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int trechos = 0, acima = 0, aceito = 0;
        double pedagio = 1;

        System.out.print("Informe o valor máximo do pedágio que você concorda em pagar: ");
        double maximo = teclado.nextDouble();
        
        while (pedagio > 0) {        
            System.out.print("Informe o valor do pedágio: ");
            pedagio = teclado.nextDouble();

            if (pedagio < 0) {
                break;  }

            System.out.print("Informe o a distância do trecho (em Km): ");
            double distancia = teclado.nextDouble();
            
            if (pedagio > maximo) {
                acima++; }

            trechos++;

            if (distancia > 150 && pedagio < maximo) {
                aceito++; }
        }

        System.out.println("Trechos com valor acima do qual ele nega-se a pagar: " + acima + "\n" + "Quantidade de trechos informados: " + trechos++ + "\n" + "Trechos acima de 150km com valor aceito por ele: " + aceito++);

        teclado.close();
    }
}