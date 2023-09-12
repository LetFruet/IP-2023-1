package Unidade6;
import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        String Moca[] = new String[5];
        String Rapaz[] = new String[5];

        lerRespostas(Moca, Rapaz, teclado);
        calcularTotal(Moca, Rapaz);

        int total = calcularTotal(Moca, Rapaz);
    
        if (total == 15) {
            System.out.println("Casem!"); }
        else if (total >= 10 && total <= 14) {
            System.out.println("Voces têm muita coisa em comum!"); }
        else if (total >= 5 && total <= 9) {
            System.out.println("Talvez não dê certo :("); }
        else if (total >= 0 && total <= 4) {
            System.out.println("Vale um encontro"); }
        else if (total <= -1 && total >= -9) {
            System.out.println("Melhor não perder tempo"); }
        else {
            System.out.println("Vocês se odeiam!"); }
   
        teclado.close();
    }

    public static void lerRespostas(String Moca[], String Rapaz[], Scanner teclado) {

        String perguntas[] = { "Gosta de música sertaneja? ", "Gosta de futebol? ", "Gosta de seriados? ", "Gosta de redes sociais? ", "Gosta da Oktoberfest? " };

        System.out.println("Perguntas para a moça!");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            Moca[i] = teclado.next().toUpperCase();
        }
        
        System.out.println();
        System.out.println("Perguntas para o rapaz!");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            Rapaz[i] = teclado.next().toUpperCase();
        }
    }

    public static int calcularTotal(String respostasMoca[], String respostasRapaz[]) {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            if ((respostasMoca[i].equals("SIM") && respostasRapaz[i].equals("SIM")) || (respostasMoca[i].equals("NAO") && respostasRapaz[i].equals("NAO")) || (respostasMoca[i].equals("IND") && respostasRapaz[i].equals("IND"))) {
                total += 3; }
            else if ((respostasMoca[i].equals("NAO") && respostasRapaz[i].equals("SIM")) || (respostasMoca[i].equals("SIM") && respostasRapaz[i].equals("NAO"))) {
                total -= 2; }
            else {
                total += 1; }
        }
        
        return total;
    }
}