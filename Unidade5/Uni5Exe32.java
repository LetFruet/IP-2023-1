package Unidade5;
import java.util.Scanner;

public class Uni5Exe32 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia para iniciar a semana: (1=Domingo, ..., 7=Sábado): ");
        int dia_inicial = teclado.nextInt();
        System.out.print("Digite a quantidade de dias do mês: ");
        int qtd_dias = teclado.nextInt();

        int dia = 1, dia_semana = 1;

        while (dia_semana < dia_inicial) {
            System.out.print("\t");
            dia_semana++; }

        while (dia <= qtd_dias) {
            while (dia_semana <= 7 && dia <= qtd_dias) {
                System.out.print(dia + "\t");
                dia++;
                dia_semana++; }
                
            dia_semana = 1;
            System.out.println(""); }

        teclado.close();
    }
}