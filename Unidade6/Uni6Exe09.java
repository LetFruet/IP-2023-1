package Unidade6;
import java.util.Scanner;

public class Uni6Exe09 {    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = 50;
        int sexo[] = new int[n];
        int nota[] = new int[n];
        int idade[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o sexo: \n1=feminino \n2=masculino");
            sexo[i] = teclado.nextInt();
                while (sexo[i] != 1 && sexo[i] != 2) {
                    System.out.println("O valor informado não existe. \nEntre com um valor aceito: ");
                    sexo[i] = teclado.nextInt(); }

            System.out.println("Dê uma nota de 0 a 10 para o cinema: ");
            nota[i] = teclado.nextInt();
                while (nota[i] < 0 || nota[i] > 10) {
                    System.out.println("O valor informado não existe. \nEntre com uma nota aceita: ");
                    nota[i] = teclado.nextInt(); }

            System.out.println("Informe a sua idade: ");
            idade[i] = teclado.nextInt(); 
        }
            
        double mediaG = mediaGeral(nota);
        double mediaH = mediaHomens(sexo, nota);
        double notaMulherJ = mulherJovem(sexo, nota, idade);
        double mulher50 = mulheresAcima(sexo, nota, idade, mediaG);

        System.out.println("A média geral do cinema é: " + mediaG);
        System.out.println("A média geral do cinema dada pelos homens é: " + mediaH);
        System.out.println("A nota dada ao cinema pela mulher mais jovem é: " + notaMulherJ);
        System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota superior a média geral recebida pelo cinema é: " + mulher50);

        teclado.close();
    }
    
    public static double mediaGeral(int nota[]) {
        int soma = 0;

        for (int i = 0; i < nota.length; i++) {
            soma += nota[i];
        }

        double mediaG = soma / nota.length;
        
        return mediaG;
    }

    public static double mediaHomens(int sexo[], int nota[]) {
        int soma = 0, cont = 0;
        double mediaH = 0;

        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 2) {
                soma += nota[i];
                cont++;
            }
        }

        if (cont != 0) {
            mediaH = soma / cont;
            return mediaH;
        }

        return 0;  
    }

    public static int mulherJovem(int sexo[], int nota[], int idade[]) {
        int notaMulherJ = 0, idadeJovem = Integer.MAX_VALUE;

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < idadeJovem && sexo[i] == 1) {
                idadeJovem = idade[i];
                notaMulherJ = nota[i];
            }
        }
        return notaMulherJ;
    }

    public static int mulheresAcima(int sexo[], int nota[], int idade[], double mediaG) {
        int mulher50 = 0;

        for (int i = 0; i < idade.length; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaG) {
                mulher50++;
            }
        }

        return mulher50;
    }
}