package Unidade2;

     import java.util.Scanner;
    
    public class Uni2Exe13 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        // Entrada
        System.out.print("Informe a velocidade de X: ");
        int velX= teclado.nextInt();
        System.out.print("Informe a velocidade de Y: ");
        int velY= teclado.nextInt();
        System.out.print("Informe a distância entre X e Y: ");
        int distancia= teclado.nextInt(); 
        
        // Processo
            double tempo=((velY/distancia)-(velX/distancia))*60;
    
        // Saída
        System.out.print("O carro Y leva " + tempo);
        System.out.print(" segundos para se distanciar do outro carro");

        teclado.close();
      }
    }
    
    