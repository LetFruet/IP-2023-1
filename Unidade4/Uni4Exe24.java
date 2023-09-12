package Unidade4;

import java.util.Scanner;
public class Uni4Exe24 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Opção = 1, valores em ordem crescente. Opção = 2, evalores em ordem decrescente. Opção = 3, o maior valor fique no meio: ");
    int opcao = teclado.nextInt ();  
    System.out.print("Valor A: ");
    int A = teclado.nextInt();   
    System.out.print("valor B: ");
    int B = teclado.nextInt ();   
    System.out.print("valor C: ");
    int C = teclado.nextInt ();   
    
    switch (opcao) {
        case 1: if (A < B && B < C) {
            System.out.println(A); 
            System.out.println(B);
            System.out.println(C); }
          if (A < C && C < B) {
            System.out.println(A); 
            System.out.println(C);
            System.out.println(B); }
          if (B < A && A < C) {
            System.out.println(B);
            System.out.println(A);
            System.out.println(C); }
          if (B < C && C < A) {
            System.out.println(B); 
            System.out.println(C); 
            System.out.println(A); }
          if (C < A && A < B) {
            System.out.println(C);
            System.out.println(A); 
            System.out.println(B); }
          if (C < B && B < A) {
            System.out.println(C); 
            System.out.println(B); 
            System.out.println(A); }
          break;
        case 2: if (A > B && B > C) {
            System.out.println(A); 
            System.out.println(B);
            System.out.println(C); }
          if (A > C && C > B) {
            System.out.println(A);
            System.out.println(C);
            System.out.println(B); }
          if (B > A && A > C) {
            System.out.println(B); 
            System.out.println(A); 
            System.out.println(C); }
          if (B > C && C > A) {
            System.out.println(B);
            System.out.println(C);
            System.out.println(A); }
          if (C > A && A > B) {
          System.out.println(C);
          System.out.println(A);
          System.out.println(B); }
          if (C > B && B > A) {
            System.out.println(C);
            System.out.println(B);
            System.out.println(A); }
          break;
        case 3: if (A < B && B < C) {
            System.out.println(A);
            System.out.println(C);
            System.out.println(B); }
          if (A < C && C < B) {
            System.out.println(A);
            System.out.println(B);
            System.out.println(C); }
          if (B < A && A < C) {
            System.out.println(B); 
            System.out.println(C); 
            System.out.println(A); }
          if (B < C && C < A) {
            System.out.println(B);
            System.out.println(C);
            System.out.println(A); }
          if (C < A && A < B) {
            System.out.println(C);
            System.out.println(B);
            System.out.println(A); }
          if (C < B && B < A) {
            System.out.println(C);
            System.out.println(A);
            System.out.println(B); }
          break;
    }

    teclado.close();
    }
}

