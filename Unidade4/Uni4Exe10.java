package Unidade4;

import java.util.Scanner;
public class Uni4Exe10 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe a idade de Marquinhos: ");
    int marquinhos = teclado.nextInt ();   
    System.out.print("Informe a idade de Zezinho: ");
    int zezinho = teclado.nextInt ();   
    System.out.print("Informe a idade de Luluzinha: ");
    int luluzinha = teclado.nextInt ();   

    if (marquinhos < (luluzinha) && marquinhos < (zezinho)) {
        System.out.println("Maquinhos é o caçula da família"); }
    if (luluzinha < (marquinhos) && luluzinha < (zezinho)) {
        System.out.println("Luluzinha é o caçula da família"); }
    if (zezinho < (marquinhos) && zezinho < (luluzinha)) {
        System.out.println("Zezinho é a caçula da família"); }
 
    teclado.close();
    }
}
