package Unidade5;
import java.util.Scanner;

public class Uni5Exe34 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha = 0, diarias = 0, escolha1 = 0;
        String nome = " ", sobrenome = " ";
        double pagamento = 0;

        do {
            System.out.println("Digite sua escolha: \n1 - encerrar a conta de um hóspede \n2 - verificar número de contas encerradas \n3 - sair");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                System.out.println("Digite o nome do hóspede");
                nome = teclado.next();
                System.out.println("Digite o sobrenome do hóspede");
                sobrenome = teclado.next();
                System.out.println("Digite o número de diárias do hóspede");
                diarias = teclado.nextInt();

                escolha1++;

                if(diarias < 15) {
                pagamento = (diarias * 7.5) + 50;
                System.out.println(nome + " " + sobrenome + "\n" + pagamento); }

                if(diarias == 15) {
                pagamento = (diarias * 6.5) + 50;
                System.out.println(nome + " " + sobrenome + "\n" + pagamento); }

                if(diarias > 15) {
                pagamento = (diarias * 5) + 50;
                System.out.println(nome + " " + sobrenome + "\n" + pagamento); }
                break; 

                case 2:
                System.out.println("Hóspedes que dexaram o hotel: " + escolha1);
                break;

                case 3:
                    break;
                default:
                    System.out.println("Opção inexistente");
            }

        } while (escolha != 3);
   
        teclado.close();
    }
}
