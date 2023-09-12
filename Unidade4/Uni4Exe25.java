package Unidade4;

import java.util.Scanner;
public class Uni4Exe25 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("1: Soma de dois números. 2: Diferença entre dois números. 3: Produto entre dois números. 4: Divisão entre dois números (o denominador não pode ser zero: ");
    int valor = teclado.nextInt ();   
    System.out.print("Valor A: ");
    int valorA = teclado.nextInt ();   
    System.out.print("valor B: ");
    int valorB = teclado.nextInt ();   

   
    switch (valor) {
        case 1:
            System.out.println(valorA+valorB);
            break;
        case 2: 
        if ( valorA > valorB){
            System.out.println(valorA-valorB);}
        if ( valorB > valorA){
            System.out.println(valorB-valorA);}    
            break;
        case 3:
            System.out.println(valorA * valorB);
            break;
        case 4: if ( valorB != 0) {
            System.out.println(valorA / valorB); }
    }

    teclado.close();
    }
}
