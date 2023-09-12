package Unidade4;

import java.util.Scanner;
public class Uni4Exe22 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite 1 se seu curso for Ciência da Computação, 2 se seu curso for Licenciatura da Computação e 3 se seu curso for Sistemas de Informação: ");
    String curso = teclado.nextLine ();   

    switch (curso) {
        case "1":
            System.out.println("Bacharel em Ciência da Computação");
            break;
        case "2":
            System.out.println("Licenciado em Ciência da Computação");
            break;
        case "3":
            System.out.println("Bacharel em Sistemas de Informação");
            break;
    }

    teclado.close();
    }
}
