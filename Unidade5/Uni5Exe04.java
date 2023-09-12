package Unidade5;
import java.util.Scanner;

public class Uni5Exe04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //auxiliar 4 pois o primeiro incremento é de 2 para 6 (2+4)

        double soma = 0, dividendo = 3, divisor = 2, auxiliar = 4;

        for (int quantidade = 1; quantidade <= 20; quantidade++) {
            System.out.println(dividendo + "/" + divisor);

            soma += (dividendo / divisor);
            dividendo += 2;
            divisor += auxiliar;
            auxiliar += 2; 
        }

        System.out.println("SOMA = " + soma);

        teclado.close();
    }
}