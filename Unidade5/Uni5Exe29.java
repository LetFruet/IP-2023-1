package Unidade5;
import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cedula20 = 0, cedula10 = 0, cedula5 = 0, cedula2 = 0, cedula1 = 0;
                
        System.out.print("Informe um valor: ");
        double valor = teclado.nextDouble();

        while (valor > 0) {

            if (valor >= 20) {
                cedula20++;
                valor -= 20; }

                else if (valor >= 10) {
                    cedula10++;
                    valor -= 10; }

                        else if (valor >= 5) {
                            cedula5++;
                            valor -= 5; }
                                
                            else if (valor >= 2) {
                                cedula2++;
                                valor -= 2; }

                                else if (valor >= 1) {
                                    cedula1++;
                                    valor -= 1; }

        }

        System.out.println("Cédulas de R$ 20,00: " + cedula20); 
        System.out.println("Cédulas de R$ 10,00: " + cedula10); 
        System.out.println("Cédulas de R$ 5,00: " + cedula5); 
        System.out.println("Cédulas de R$ 2,00: " + cedula2); 
        System.out.println("Cédulas de R$ 1,00: " + cedula1); 
       
        teclado.close();
    }
}