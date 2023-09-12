package Unidade4;

import java.util.Scanner;
public class Uni4Exe04 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Entre com um valor maior do que 0: ");
    double valor = teclado.nextDouble ();   

    if (valor != (int) valor) {
        System.out.println("Foram digitadas casas decimais"); }
    else {
        System.out.println("Não foram digitadas casa decimais"); }    

    teclado.close();
    }
}
