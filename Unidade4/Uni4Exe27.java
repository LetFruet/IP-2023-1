package Unidade4;

import java.util.Scanner;
public class Uni4Exe27 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe a hora de chegada: ");
    int horaC = teclado.nextInt ();   
    System.out.print("Informe os minutos de chegada: ");
    int minutoC = teclado.nextInt ();   
    System.out.print("Informe a hora de partida: ");
    int horaS = teclado.nextInt ();   
    System.out.print("Informe os minutos de partida: ");
    int minutoS = teclado.nextInt ();   
    
    int horaF = horaS - horaC;
    int minutoF = Math.abs(minutoS - minutoC);
    int tempo = (horaF *60) + minutoF;
    int valor = 0;

    System.out.println("Ficou estacionado durante: " + (horaF) + " hora(s) e " + (minutoF) + " segundos");

    if (tempo <= 149) {
        valor = 5;}
    else if (tempo <= 150 && tempo >= 269) {
        valor = 7;}
        else if (tempo <= 270) {
            valor = 10;}

    switch (valor) {
        case (5): {
            System.out.println("R$ 5,00 reais"); 
            break; }
        case (7): {
            System.out.println("R$ 7,50 reais"); 
            break; }
        case (10): {
            System.out.println("R$ 10,00 reais"); 
            break; } }
            
    teclado.close();
    }
}