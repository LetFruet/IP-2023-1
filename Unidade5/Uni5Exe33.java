package Unidade5;
import java.util.Scanner;

public class Uni5Exe33 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, nulo = 0, branco = 0, voto = 1;

        do {
            System.out.println("Digite seu voto: \n1, 2, 3, 4 - para candidato \n5 - nulo \n6 - branco \n0 - sair");
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
                case 4:
                    voto++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inexistente");
            }

        } while (voto != 0);

            System.out.println("Candidato 1: " + voto1 + "\nCandidato 2: " + voto2 + "\nCandidato 3: " + voto3 + "\nCandidato 4: " + voto4 + "\nBranco: " + branco + "\nNulos: " + nulo);

            int total = voto1 + voto2 + voto3 + voto4 + branco + nulo;

            double percen_branco = (branco * 100) / total;
            double percen_nulo = (nulo * 100) / total;

            System.out.println("Percentual branco: " + percen_branco + "\n" + "Percentual nulo: " + percen_nulo);
            
        teclado.close();

    }
}