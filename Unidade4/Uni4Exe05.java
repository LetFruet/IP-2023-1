package Unidade4;

import java.util.Scanner;
public class Uni4Exe05 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("A cor é azul? Digite true or false: ");
    boolean cor = teclado.nextBoolean ();   

    if (cor == true) {
        System.out.println("Sim"); }
    else {
        System.out.println("Não"); }   
    
    teclado.close();
    }
}
