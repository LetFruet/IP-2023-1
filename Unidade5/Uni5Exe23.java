package Unidade5;
import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = " ";
        int n = 0;
        double salario = 0;

        System.out.print("Deseja digitar os dados de mais um vendedor? s (SIM) / n (NÃO): ");
        String S_N = teclado.next().toUpperCase();

        while (S_N.equals("S")) {
            System.out.print("Informe o nome do vendedor: ");
            nome = teclado.next();
            System.out.print("Informe o total de produtos vendidos pelo vendedor: ");
            n = teclado.nextInt();

            salario = n * 0.3;
            
            System.out.println(nome + "\n" + "Total de vendas: R$ " + n + "\n" + "Salário: R$ " + salario); 
            
            System.out.print("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            S_N = teclado.next().toUpperCase();
        }

        teclado.close();
    }
}