package Uri;
import java.util.Scanner;

public class Uri1175 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaração
        int N[] = new int[20];

        // populando
        for (int i = 0; i < 20; i++)
            N[i] = teclado.nextInt();
        
        // trocando
        int tamanho = N.length;
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = N[i];
            N[i] = N[tamanho - 1 - i];
            N[tamanho - 1 - i] = temp;
        }

        // listando
        for (int i = 0; i < N.length; i++)
            System.out.println("N[" + i + "] = " + N[i]);

        teclado.close();
    }
}