package Unidade4;

import java.util.Scanner;
public class Uni4Exe17 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe a renda anual: ");
    double rendaanual = teclado.nextDouble ();  
    System.out.print("Informe o número de dependentes: ");
    int dependentes = teclado.nextInt ();   
 
double rendaliquida= rendaanual - (dependentes*0.02);

if (rendaliquida <= 2000) {
    System.out.println("Não paga impostos"); }
else if (rendaliquida > 2000 && rendaliquida <= 5000) {
        System.out.println("Imposto de 5% sobre o valor"); }
    else if (rendaliquida > 5000 && rendaliquida <= 10000) {
            System.out.println("Imposto de 10% sobre o valor"); }
        else if (rendaliquida > 10000) {
                System.out.println("Imposto de 15% sobre o valor"); }

    teclado.close();
    }
}
