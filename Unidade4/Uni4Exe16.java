package Unidade4;

import java.util.Scanner;
public class Uni4Exe16 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe a idade do primeiro homem: ");
    int h1 = teclado.nextInt ();   
    System.out.print("Informe a idade do segundo homem: ");
    int h2 = teclado.nextInt ();  
    System.out.print("Informe a idade da primeira mulher: ");
    int m1 = teclado.nextInt ();  
    System.out.print("Informe a idade da segunda mulher: ");
    int m2 = teclado.nextInt ();  

    if (h1 > h2 && m1 > m2) {
        int soma = h1 + m2;
        int mult = h2 * m1;
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + (soma));
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + (mult)); }

    if (h1 > h2 && m2 > m1) {
        int soma = h1 + m1;
        int mult = h2 * m2;
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + (soma));
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + (mult)); }

    if (h2 > h1 && m1 > m2) {
        int soma = h2 + m2;
        int mult = h1 * m1;
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + (soma));
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + (mult)); }

    if (h2 > h1 && m2 > m1) {
        int soma = h2 + m1;
        int mult = h1 * m2;
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + (soma));
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + (mult)); }

    teclado.close();
    }
}
