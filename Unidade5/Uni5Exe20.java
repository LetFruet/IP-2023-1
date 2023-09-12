package Unidade5;
import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a massa inicial em Kg: ");
        double massa_Kg = teclado.nextDouble(); 

        int segundos = 0; 
        double massa_g = massa_Kg * 1000;

        while(massa_g >= 0.5) { 
            massa_g /= 2; 
            segundos += 50; 
        }
            
        System.out.print("Massa inicial em Kg: " + massa_Kg + "\n" + "Massa final em gramas: " + massa_g + "\n" + "Tempo em segundos: " + segundos);

        teclado.close();
    }
}