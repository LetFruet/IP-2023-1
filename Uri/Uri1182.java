package Uri;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1182 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        // Coluna onde será efetuada a operação desejada
        int C = teclado.nextInt();

        // Operação desejada (S - soma / M - média)
        String T = teclado.next().toUpperCase();

        // Criar matriz 12x12
        double[][] matriz = new double[12][12];

        // Preencher matriz com valores informados pelo usuário
        // i para controlar linha e j para controlar coluna 
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < 12; i++) {
                matriz[i][j] = teclado.nextDouble(); }
        }
        
        if (T.charAt(0) == 'S') {
            int soma = 0;
            for (int i = 0; i < 12; i++) {
                soma += matriz[i][C];
            }
            System.out.println(df_1.format(soma));
        }
            else {
                if (T.charAt(0) == 'M') {
                int soma = 0;
                for (int i = 0; i < 12; i++) {
                    soma += matriz[i][C];
                }
                double media = (double) soma / 12;
                System.out.println(df_1.format(media));
                }
            }
            
        teclado.close();
    }
}