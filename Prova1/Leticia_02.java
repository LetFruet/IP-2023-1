package Prova1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Leticia_02 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe o código do hotel: ");
        String codigo = teclado.nextLine ().toUpperCase();   
        System.out.println("Informe o preço inicial a pagar: ");
        double preço_inicial = teclado.nextDouble (); 
        

        switch (codigo) {
            case "A":
                if (preço_inicial <= 500) {
                System.out.println("Hotel: 123Milhas");
                double desconto_A = preço_inicial * 0.15;
                System.out.println("Desconto: " + df_2.format(desconto_A));
                double preço_final_A = preço_inicial - desconto_A;
                System.out.println("Preço total: " + df_2.format(preço_final_A)); }
                break;
            case "B": 
                if (preço_inicial <= 600); {
                System.out.println("Hotel: MaxMilhas");
                double desconto_B = preço_inicial * 0.15;
                System.out.println("Desconto: " + df_2.format(desconto_B));
                double preço_final_B = preço_inicial - desconto_B;
                System.out.println("Preço total: " + df_2.format(preço_final_B)); }              
                break;
            case "C":
                if (preço_inicial <= 1500); {
                System.out.println("Hotel: Azul Viagens");
                double desconto_C = preço_inicial * 0.20;
                System.out.println("Desconto: " + df_2.format(desconto_C));
                double preço_final_C = preço_inicial - desconto_C;
                System.out.println("Preço total: " + df_2.format(preço_final_C)); }               
                break;
            case "D":
                if (preço_inicial >= 300 && preço_inicial <= 2000); {
                System.out.println("Hotel: Gol Viagens");
                double desconto_D = preço_inicial * 0.30;
                System.out.println("Desconto: " + df_2.format(desconto_D));
                double preço_final_D = preço_inicial - desconto_D;
                System.out.println("Preço total: " + df_2.format(preço_final_D)); }               
                break;
            case "E":
                if (preço_inicial >= 300 && preço_inicial <= 2000); {
                System.out.println("Hotel: Latam Travel");
                double desconto_E = preço_inicial * 0.40;
                System.out.println("Desconto: " + df_2.format(desconto_E));
                double preço_final_E = preço_inicial - desconto_E;
                System.out.println("Preço total: " + df_2.format(preço_final_E)); }               
                break;
            case "F":
                System.out.println("Hotel: Outros"); 
                System.out.println("Desconto: Não há desconto" );
                double preço_final_F = preço_inicial;
                System.out.println("Preço total: " + df_2.format(preço_final_F));                
                break;
        default: 
            System.out.println("Código inválido");   
        }

        teclado.close();
    }
}


