package Unidade4;

import java.util.Scanner;
public class Uni4Exe09 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe um valor A: ");
    int valorA = teclado.nextInt();   
    System.out.print("Informe um valor B: ");
    int valorB = teclado.nextInt ();   

    if (valorA > valorB && valorA % valorB == 0 || valorA < valorB && valorB % valorA == 0) {
        System.out.println("Os valores são múltiplos"); } 
    else {
        System.out.println("Os valores não são múltiplos"); }

    teclado.close();
    }
}

