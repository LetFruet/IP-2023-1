package Prova2;
import java.util.Scanner;

public class LeticiaFruet_1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int voto = 0, voto1 = 0, voto2 = 0, voto3 = 0;

        do {

            System.out.println("Informe o seu voto: \n1 = Chapa1 \n2 = Chapa2 \n3 = Voto nulo \n9 = Encerrar votação");
            voto = teclado.nextInt();
        
            switch (voto) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção incorreta. \nInforme o seu voto: ");
                    voto = teclado.nextInt();
            }

        } while (voto != 9);

            int total = voto1 + voto2 + voto3;

            int chapa1 =+ voto1;
            double percentual1 = (chapa1 * 100) / total;

            int chapa2 =+ voto2;
            double percentual2 = (chapa2 * 100) / total;

            int nulos =+ voto3;
            double percentualNulo = (nulos * 100) / total;

            System.out.println("Total de votos da Chapa1 = " + chapa1 + "\nPercentual da Chapa1 = " + percentual1 + "\nTotal de votos da Chapa2 = " + chapa2 + "\nPercentual da Chapa2 = " + percentual2 + "\nTotal de votos da nulos = " + nulos + "\nPercentual da nulos = " + percentualNulo);

            if (chapa1 > chapa2) {
                System.out.println("A chapa 1 venceu"); }
                    else if (chapa1 < chapa2) {
                        System.out.println("A chapa 2 venceu"); }
                            else {
                                System.out.println("Empate na votação"); }

        teclado.close();
    }
}