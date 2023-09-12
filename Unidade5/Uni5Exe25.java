package Unidade5;
import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String S_N = "s", D_E = " ";
        int pontoD = 0, pontoE = 0;

        while (S_N.equals("s")) {        
            System.out.print("Informe o lado vencedor da rodada: ");
            D_E = teclado.next().toUpperCase();
            
            if (D_E.equals("D")) {
                pontoD++; }
                else {
                    pontoE++; }     

            if (pontoD == 21 && (pontoD - pontoE >= 2)) {
                System.out.print("O jogador do lado esquerdo ganhou");
                S_N = "n";
                break; }
                
            if (pontoE == 21 && (pontoE - pontoD >= 2)) {
                System.out.print("O jogador do lado direito ganhou");
                S_N = "n";
                break; }

            if (pontoD > 21 && (pontoD - pontoE == 2)) {
                System.out.print("O jogador do lado esquerdo ganhou");
                S_N = "n";
                break; }

            if (pontoE > 21 && (pontoE - pontoD == 2)) {
                System.out.print("O jogador do lado esquerdo ganhou");
                S_N = "n";
                break; }
        }

        teclado.close();
    }
}