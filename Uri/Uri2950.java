package Uri;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri2950 {
 
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    int distanciaN = teclado.nextInt ();   
    int p_SauronX = teclado.nextInt ();   
    int p_SarumanY = teclado.nextInt ();   

    double ICM = ((double)distanciaN / ((double)p_SauronX  + p_SarumanY)); 
    System.out.println(df_2.format(ICM)); 
    
    teclado.close();
    }
} 