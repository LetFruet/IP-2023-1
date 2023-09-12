package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe09 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.print("Informe a altura da lata: ");
    double altura= teclado.nextDouble();
       System.out.print("Informe o raio da lata: ");
    double raio = teclado.nextDouble();   

    // Processo
        double Mult = (altura*raio*raio*3.14159265);

    // Saída
    System.out.println(" O volume da lata de óleo  é: " + df_2.format(Mult));
    teclado.close();
  }
}
