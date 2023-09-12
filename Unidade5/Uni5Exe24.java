package Unidade5;
import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double limite_kg = 0, peso_unidade = 0, peso_total = 0, limite_g = 0;

        System.out.print("Deseja informar o peso de mais um peixe? s (SIM) / n (NÃO)?: ");
        String S_N = teclado.next().toUpperCase();

        System.out.print("Informe o limite diário em Kg: ");
        limite_kg = teclado.nextDouble();

        while (S_N.equals("S")) {        
            System.out.print("Informe o peso (em gramas) de cada peixe: ");
            peso_unidade = teclado.nextInt();

            limite_g = limite_kg * 1000;
            peso_total += peso_unidade;
            
            if (peso_total > limite_g) {
                System.out.print("O valor total excede o limite diário");
                break; }

            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            S_N = teclado.next().toUpperCase(); 
        }
        
        System.out.println("Peso total: " + peso_total/1000 + " Kg"); 

        teclado.close();
    }
}