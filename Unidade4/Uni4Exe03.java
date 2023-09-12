package Unidade4;

import java.util.Scanner;
public class Uni4Exe03 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Entre com um valor A: ");
    double valorA = teclado.nextDouble ();   
    System.out.print("Entre com um valor B: ");
    double valorB = teclado.nextDouble ();   

    if (valorA > valorB) {
        System.out.println(valorA); }
    else {
        System.out.println(valorB); }  

    teclado.close();
    }
}
