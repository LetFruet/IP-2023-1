package Unidade5;
import java.util.Scanner;

public class Uni5Exe09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Entre com o número de alunos: ");
        int alunos = teclado.nextInt();  

        String idade18 = "";
        int qntd = 0;

        for (int i = 1; i <= alunos; i++) {
            System.out.println("Entre com o nome do aluno: ");
            String nome = teclado.next();  
            System.out.println("Entre com a idade do aluno: ");
            int idade = teclado.nextInt(); 

            if (idade == 18) {
                idade18 += nome + " "; }

            if (idade > 20) {
                qntd++; } 
        }
    
        System.out.println("Alunos com 18 anos: " + idade18); 
        System.out.println("Alunos acima de 20 anos: " + qntd); 

        teclado.close();
    }
}
