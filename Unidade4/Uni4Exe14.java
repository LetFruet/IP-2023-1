package Unidade4;

import java.util.Scanner;
public class Uni4Exe14 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

   System.out.print("Informe o dia: ");
   int dia = teclado.nextInt ();   
   System.out.print("Informe o mês: ");
   int mes = teclado.nextInt ();   
   System.out.print("Informe o ano: ");
   int ano = teclado.nextInt ();   

   if (dia > 0 && dia <32 && mes > 0 && mes < 13 && ano > 0) {
      if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
         System.out.print("Valida"); }
      else if (mes != 2 && dia < 31) {
         System.out.print("Valida"); }
      else if (mes == 2 && dia <= 28) {
         System.out.print("Valida"); }
      else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
         System.out.print("Valida"); }
      else {
         System.out.print("Nao valida"); } }
   else {
      System.out.print("Nao valida"); }

  teclado.close();
  }
}
