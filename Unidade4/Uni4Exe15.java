package Unidade4;

import java.util.Scanner;
public class Uni4Exe15 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe a quantidade de meses que o funcionário foi admitido: ");
    int qtmeses = teclado.nextInt ();   

    if (qtmeses >= 1 && qtmeses <= 12) {
        System.out.println("Reajuste de 5%"); }
    else if (qtmeses >= 13 && qtmeses <= 48) {
            System.out.println("Reajuste de 7%"); }

    teclado.close();
    }
}
