package Unidade4;

import java.util.Scanner;
public class Uni4Exe26 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Opção = ‘T’: calcular a área de um triângulo de base b e altura h. Opção = ‘Q’: calcular a área de um quadrado de lado l. Opção = ‘R’: calcular a área de um retângulo de base b e altura h. Opção = ‘C’: calcular a área de um círculo de raio r: ");
    String opcao = teclado.nextLine ().toUpperCase();   
   
    switch (opcao) {
        case "T": 
          System.out.print("Valor base: ");
          int base = teclado.nextInt();   
          System.out.print("Valor altura: ");
          int altura = teclado.nextInt ();  
          System.out.println("Área do triângulo = " + ((base*altura)/2));
          break;
        case "Q": 
          System.out.print("Valor lado: ");
          int lado = teclado.nextInt (); 
          System.out.println("Área do quadrado = " + (lado*lado));   
          break;
        case "R":
          System.out.print("Valor base: ");
          int base1 = teclado.nextInt();   
          System.out.print("Valor altura: ");
          int altura1 = teclado.nextInt ();  
          System.out.println("Área do retângulo = " + (base1*altura1));
          break;
        case "C":
          System.out.print("Valor raio: ");
          int raio = teclado.nextInt ();
          System.out.println("Área do círculo = " + ((raio*raio)*3.14159));
          break;
    }

    teclado.close();
    }
}
