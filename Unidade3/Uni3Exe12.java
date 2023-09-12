package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe12 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o nome do vendedor: ");
    String nome_vend = teclado.nextLine();   
    System.out.print("Informe as horas trabalhadas: ");
    double horas = teclado.nextDouble();   
    System.out.print("Informe o número de dependentes: ");
    double dep = teclado.nextDouble();   

    // Processo
    Double valor_horas=horas*10;
    Double valor_dep=dep*60;
    Double bruto=valor_horas+valor_dep;
    Double liquido= (valor_horas*0.135)+valor_dep;

    // Saída
    System.out.println("O nome do vendeor é: " + (nome_vend) +
                     "O salário bruto é: " + df_2.format(bruto) +
                     "O salário líquido é: " + df_2.format(liquido));

    teclado.close();
  }
}
