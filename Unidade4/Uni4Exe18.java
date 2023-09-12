package Unidade4;

import java.util.Scanner;
public class Uni4Exe18 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe o dia do pagamento: ");
    int pagamento = teclado.nextInt ();  
    System.out.print("Informe o dia do vencimento: ");
    int vencimento = teclado.nextInt ();  
    System.out.print("Informe o valor da prestação: ");
    double valor = teclado.nextDouble();  
   
    double desconto = valor * 0.90;
    int atraso = pagamento - vencimento;
    double multa = valor + (valor * (atraso * 0.02));

    if (pagamento <= vencimento) {
        System.out.println("O pagamento está em dia, há um desconto de 10% = " + (desconto)); }
    else if (pagamento > vencimento && pagamento <= (vencimento + 5)) {
            System.out.println("O valor não está em dia, não há desconto nem multa"); }
        else if (pagamento > (vencimento + 5)) {
                System.out.println("O valor não está em dia, há uma multa de 2% = " + (multa)); }

    teclado.close();
    }
}
