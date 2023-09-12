package Unidade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
     System.out.println("Informe o código do funcionário");
    int codfun = teclado.nextInt();
    System.out.println("Informe a quantidade de horas trabalhadas");
    double hortrab = teclado.nextDouble();   
    System.out.println("Informe valor hora");
    double vlrhora = teclado.nextDouble();   

    // Processo
        double salario = hortrab * vlrhora;

    // Saída
    System.out.println(" Funcionário " + codfun +
                       " Salário: " + df_2.format(salario));
    teclado.close();
  }
}