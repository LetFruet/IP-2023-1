package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe14 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe a distância percorrida em km: ");
    double dist = teclado.nextDouble();   
    System.out.print("Informe o tempo gasto em horas: ");
    double tempo = teclado.nextDouble();   

    // Processo
        Double vm=dist/tempo;
        Double comb=dist/12;

    // Saída
    System.out.println("A velocidade média durante a viagem foi " + df_2.format(vm) + " Km/h");
    System.out.println("A quantidade de combustível gasto foi " + df_2.format(comb) + " litros");

    teclado.close();
  }
}
