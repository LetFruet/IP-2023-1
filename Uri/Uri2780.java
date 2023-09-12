package Uri;
import java.util.Scanner;
public class Uri2780 {
        
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int D = teclado.nextInt ();   

    if (D >= 0 && D <= 2000); {
    if (D <= 800) {
        System.out.println("1"); }
        else if (800 < D && D <= 1400) {
            System.out.println("2"); }
            else if (1400 < D && D <= 2000) {
                System.out.println("3"); } }
        
    teclado.close();
    }
}
