package Uri;
import java.util.Scanner;

public class Uri2766 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaração do array unidimensional String
        String[] nomes = new String[10];

        // População do array criado (vetor)
        for (int i = 0; i < 10; i++) {
            nomes[i] = teclado.next();
        }

        // Saídas indicadas no problema

        // Terceiro nome da lista
        System.out.println(nomes[2]);

        // Sétimo nome da lista
        System.out.println(nomes[6]);
        
        // Nono nome da lista
        System.out.println(nomes[8]);

        teclado.close();
    }
}