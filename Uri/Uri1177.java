package Uri;
import java.util.Scanner;

public class Uri1177 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int t = teclado.nextInt();
        
        int n[] = new int[1000];

        int cont = 0;

        for (int i = 0; i < 1000; i++) {
            if (cont == t) {
                cont = 0; }
            n[i] = cont;
            cont++; 
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " +  n[i]);
        }
        
        teclado.close();
    }
}
