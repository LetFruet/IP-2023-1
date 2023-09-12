package Prova1;
import java.util.Scanner;

public class Leticia_01 {
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        String nome = teclado.nextLine (); 
          
        if (nome.equals("")) {
            System.out.println("Dados inválidos"); }
        else {
            System.out.println("Informe o ano de nascimento: ");
            int anoNascimento = teclado.nextInt (); 

            if (anoNascimento < 1900) {
                System.out.println("Dados inválidos"); }
            else {
                int idade = 2023 - anoNascimento; 
                System.out.println("Nome: " + nome + " Idade: " + idade); } }

                teclado.close();
    }
}


