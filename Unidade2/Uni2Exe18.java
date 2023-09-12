package Unidade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe18 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o comprimento da parede em metros: ");
    double comp = teclado.nextDouble();   
    System.out.print("Informe a altura da parede em metros: ");
    double altura = teclado.nextDouble();   

    // Processo
        Double area=comp*altura;
        Double num_azulejos=area*9;
        Double valor=num_azulejos*12.5;

    // Saída
    System.out.println("O valor gasto na compra dos azulejos foi R$ " + df_2.format(valor));

    teclado.close();
  }
}

