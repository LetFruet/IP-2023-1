package Unidade5;
import java.util.Scanner;

public class Uni5Exe11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int quebrados = 1, anterior = 1;

        for (int hora = 1; hora <= 16; hora++) {
            anterior *= 3;
            quebrados += anterior;
            System.out.print(quebrados); 
        }
    
        teclado.close();
    }
}
