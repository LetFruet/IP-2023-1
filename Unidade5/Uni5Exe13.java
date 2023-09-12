package Unidade5;
import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        double km = 0, soma_km = 0, litro = 0, soma_litro = 0, media = 0;

        System.out.print("Entre com o total de paradas: ");
        int parada = teclado.nextInt();  

        for (int i = 1; i < parada; i++) {
            System.out.print("Entre com a quilometragem: ");
            km = teclado.nextInt(); 

            soma_km =+ km;

            System.out.print("Entre com o total de litros de combustível: ");
            litro = teclado.nextInt();  

            soma_litro =+ litro;
        
            System.out.println("Km por litro da parada: " + (km / litro)); 
        }

        media = (soma_km / soma_litro);

        System.out.println("Média de km/L: " + media);

        teclado.close();
    }
}

