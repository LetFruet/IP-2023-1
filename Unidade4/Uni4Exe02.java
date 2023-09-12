package Unidade4;

import java.util.Scanner;
public class Uni4Exe02 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Entre com um valor inteiro maior do que 0: ");
    int valor = teclado.nextInt ();   

    if (valor % 2 == 0) {
        System.out.println("O número é par"); } 
    else {
        System.out.println("O número é ímpar"); }  

    teclado.close();
    }
}
