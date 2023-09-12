package Unidade2;

import java.util.Scanner;

public class Uni2Exe14 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Informe um valor inteiro: ");
    int valor= teclado.nextInt();

    // Processo
    int nota100=(valor/100);
    int nota50=(valor-(nota100*100))/50;
    int nota20=(valor-(nota100*100)-(nota50*50))/20;
    int nota10=(valor-(nota100*100)-(nota50*50)-(nota20*20))/10;
    int nota5=(valor-(nota100*100)-(nota50*50)-(nota20*20)-(nota10*10))/5;
    int nota1=(valor-(nota100*100)-(nota50*50)-(nota20*20)-(nota10*10)-(nota5*5));
    int minimo=nota100+nota50+nota20+nota10+nota5+nota1;

    // Saída
    System.out.println("O número de cédulas a ser devolvido é " + (minimo));
    System.out.println("O número de cédulas de 100 reais a ser devolvido é " + (nota100));
    System.out.println("O número de cédulas de 50 reais a ser devolvido é " + (nota50));
    System.out.println("O número de cédulas de 20 reais a ser devolvido é " + (nota20));
    System.out.println("O número de cédulas de 10 reais a ser devolvido é " + (nota10));
    System.out.println("O número de cédulas de 5 reais a ser devolvido é " + (nota5));
    System.out.println("O número de cédulas de 1 real a ser devolvido é " + (nota1));

    teclado.close();
  }
}
