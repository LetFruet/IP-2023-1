package Unidade5;
import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String novo_voto = "S";
        double percentual1 = 0, percentual2 = 0, percentual3 = 0, percentual4 = 0,  voto = 0, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, total_votos = 0;

        while (novo_voto.equals("S")) {
            System.out.println("Informe o seu voto: \n1-Nenhum de Nós \n2-CPM22 \n3-Skank \n4-Jota Quest ");
            voto = teclado.nextDouble();

            total_votos++; 

            if (voto == 1) {
                voto1++; }

            if (voto == 2) {
                voto2++; }
                
            if (voto == 3) {
                voto3++; }
                    
            if (voto == 4) {
                voto4++;}
        
                percentual1 = (voto1 * 100) / total_votos; 
                percentual2 = (voto2 * 100) / total_votos; 
                percentual3 = (voto3 * 100) / total_votos; 
                percentual4 = (voto4 * 100) / total_votos; 
                
            System.out.print("mais um voto? s (SIM) / n (NÃO): ");
            novo_voto = teclado.next().toUpperCase(); 
        } 

        if (voto1 > voto2 && voto1 > voto3 && voto1 > voto4) {
            System.out.println("O grupo 1 venceu!"); }

        if (voto2 > voto1 && voto2 > voto3 && voto2 > voto4) {
            System.out.println("O grupo 2 venceu!"); }

        if (voto3 > voto1 && voto3 > voto2 && voto3 > voto4) {
            System.out.println("O grupo 1 venceu!"); }
            
        if (voto4 > voto1 && voto4 > voto2 && voto4 > voto3) {
            System.out.println("O grupo 4 venceu!"); }
        
        System.out.println("Votos grupo 1: " + voto1); 
        System.out.println("Votos grupo 2: " + voto2); 
        System.out.println("Votos grupo 3: " + voto3); 
        System.out.println("Votos grupo 4: " + voto4); 
        System.out.println("Percentual grupo 1: " + percentual1); 
        System.out.println("Percentual grupo 2: " + percentual2); 
        System.out.println("Percentual grupo 3: " + percentual3); 
        System.out.println("Percentual grupo 4: " + percentual4); 

        teclado.close();
    }
}