package Unidade4;

import java.util.Scanner;
public class Uni4Exe06 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Entre com uma letra: ");
    String letra = teclado.next ().toUpperCase();   

    switch (letra) {
        case "F":
            System.out.println("Feminino");
            break;
        case "M":
            System.out.println("Masculino");
            break; 
        case "I": 
            System.out.println("Não informado");
            break;
        default:
            System.out.println("Entrada incorreta");
    }

    teclado.close();
    }
}
