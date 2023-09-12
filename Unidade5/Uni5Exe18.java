package Unidade5;
import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int canal = 1, telespectadores = 0, soma_4 = 0, soma_5 = 0, soma_9 = 0, soma_12 = 0, teles_4 = 0, teles_5 = 0, teles_9 = 0, teles_12 = 0, soma_teles = 0;

        while(canal != 0) { 
            System.out.print("Informe o número do canal: ");
            canal = teclado.nextInt(); 
            
            if (canal == 0) {
                break; }

            System.out.print("Informe o número de telespectadores do canal: ");
            telespectadores = teclado.nextInt(); 

            if(canal == 4) {
                soma_4 += telespectadores; }
                
            if(canal == 5) {
                soma_5 += telespectadores; }

            if(canal == 9) {
                soma_9 += telespectadores; }

            if(canal == 12) {
                soma_12 += telespectadores; }

            soma_teles += telespectadores; 

            teles_4 = soma_4 * 100 / soma_teles;
            teles_5 = soma_5 * 100 / soma_teles;
            teles_9 = soma_9 * 100 / soma_teles;
            teles_12 = soma_12 * 100 / soma_teles; 
        }

        System.out.println("Percentual de audiência da emissora 4: " + teles_4 + "%");
        System.out.println("Percentual de audiência da emissora 5: " + teles_5 + "%");
        System.out.println("Percentual de audiência da emissora 9: " + teles_9 + "%");
        System.out.println("Percentual de audiência da emissora 12: " + teles_12 + "%");

        teclado.close();
    }
}