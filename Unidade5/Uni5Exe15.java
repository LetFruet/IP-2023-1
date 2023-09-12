package Unidade5;
import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Escreva o nome do aluno: ");
        String nome = teclado.next(); 
    
        while(!nome.equals("fim")) {
            System.out.println("Escreva as duas notas do aluno: ");
            double nota1 = teclado.nextDouble(); 
            double nota2 = teclado.nextDouble(); 

            double media = (nota1 + nota2) / 2;

            System.out.println("Nome: " + nome + "\n" + "Média: " + media); 
    
            System.out.print("Escreva o nome do aluno: ");
            nome = teclado.next(); 
        }

        teclado.close();
    }
}
