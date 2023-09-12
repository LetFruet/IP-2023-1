package Unidade4;

import java.util.Scanner;
public class Uni4Exe11 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe o ano de nascimento do primeiro: ");
    int primeiro = teclado.nextInt ();   
    System.out.print("Informe o ano de nascimento do segundo: ");
    int segundo = teclado.nextInt ();   
    System.out.print("Informe o ano de nascimento do terceiro: ");
    int terceiro = teclado.nextInt ();   

    if ( primeiro != segundo && segundo != terceiro) {
        System.out.println("Eles são apenas irmãos"); }
    if (primeiro == segundo && segundo == terceiro) {
        System.out.println("Eles são trigêmeos"); }
    if (primeiro == segundo && primeiro != terceiro || primeiro == terceiro && primeiro != segundo || segundo == terceiro && segundo != primeiro) {
        System.out.println("Dois deles são gêmeos"); }
       
    teclado.close();
    }
}

