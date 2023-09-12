package Unidade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe07 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
     System.out.println("Informe o nome do vendedor");
    String nome = teclado.nextLine();
    System.out.println("Informe o salário fixo mensal");
    double salariomes = teclado.nextDouble();   
    System.out.println("Informe o total de vendas efetuadas no mês");
    double vendasmes = teclado.nextDouble();   
    
    // Processo
        double salario = salariomes + (vendasmes*0.15);

    // Saída
    System.out.println("Vendedor " + nome +
                       " Salário: " + df_2.format(salario));
    teclado.close();
  }
}
