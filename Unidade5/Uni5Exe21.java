package Unidade5;
import java.util.Scanner;

public class Uni5Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altura_ze = 110, altura_chico = 150;
        int ano = 0;

        while(altura_ze <= altura_chico) { 
            altura_chico += 2; 
            altura_ze += 3;  
            ano++; 
        }

        System.out.println("Serão necessários " + ano + " anos para que Zé seja maior que Chico."); 

        teclado.close();
    }
}