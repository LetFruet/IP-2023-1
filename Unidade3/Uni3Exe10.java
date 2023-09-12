package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe o cateto oposto: ");
    double CO = teclado.nextDouble();   
    System.out.print("Informe o cateto adjacente: ");
    double CA = teclado.nextDouble();   


    // Processo
        Double Hip = Math.sqrt((CO*CO)+(CA*CA));

    // Saída
    System.out.println(" O comprimento da hipotenusa  é: " + df_2.format(Hip));
    teclado.close();
  }
}
