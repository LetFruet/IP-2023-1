package Unidade4;

import java.util.Scanner;
public class Uni4Exe20 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe a nota 1: ");
    double nota1 = teclado.nextDouble ();   
    System.out.print("Informe a nota 3: ");
    double nota2 = teclado.nextDouble ();   
    System.out.print("Informe a nota 3: ");
    double nota3 = teclado.nextDouble ();   

double media = (nota1 + nota2 + nota3) / 3;
    
    if (media >= 9.0) {
        System.out.println("A"); }
    else if (media >= 7.5 && media < 9.0) {
            System.out.println("B"); }
        else if (media >= 6.0 && media < 7.5) {
               System.out.println("C"); }
            else if (media >= 4.0 && media < 6.0) {
                   System.out.println("D"); }
                else if (media < 4.0) {
                       System.out.println("E"); }

    teclado.close();
    }
}
