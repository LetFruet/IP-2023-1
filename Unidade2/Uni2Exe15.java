package Unidade2;

import java.util.Scanner;
public class Uni2Exe15 {

        public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
    
        int total= teclado.nextInt();
        int value = total;
    
        int hundred= value / 100;
        value -= hundred * 100;
    
        int fifty= value / 50;
        value -= fifty * 50;
    
        int twenty= value / 20;
        value -= twenty * 20;
    
        int tens= value / 10;
        value -= tens * 10;
    
        int fives= value / 5;
        value -= fives * 5;
    
        int twos= value / 2;
        value -= twos * 2;
    
        int ones= value;
       
        System.out.println(total);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(tens + " nota(s) de R$ 10,00");
        System.out.println(fives + " nota(s) de R$ 5,00");
        System.out.println(twos + " nota(s) de R$ 2,00");
        System.out.println(ones + " nota(s) de R$ 1,00");
    
        teclado.close();
      }
    }