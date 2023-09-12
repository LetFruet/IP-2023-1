package Uri;
import java.util.Scanner;

public class Uri2786 {     
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        int L = teclado.nextInt ();   
        int C = teclado.nextInt ();   
    
        int T1 = (L * C) + ((L - 1) * (C - 1));
        int T2 = (2 * (L + C - 2));
    
        System.out.println(T1);
        System.out.println(T2);
        
        teclado.close();
        }
    } 