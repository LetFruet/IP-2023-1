package Unidade5;
import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num_encontrados = 0, max_num = 10;
    
        for (int i = 10; num_encontrados < max_num; i++) {
            for (int potencia = 10; potencia <= i && num_encontrados < max_num; potencia *= 10) {
                int esquerda = i % potencia;
                int direita = (i - esquerda) / potencia;
                int valor = esquerda + direita;

                if (valor*valor == i) {
                    System.out.println(direita + " + " + esquerda + " = " + valor + " -> " + valor + "*" + valor + " = " + i);
                    num_encontrados += 1; }
            }
        }

        teclado.close();
    }
}