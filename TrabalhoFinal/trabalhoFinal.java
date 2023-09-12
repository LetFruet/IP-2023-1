// Alana Andreazza, Leticia Fruet e Pedro Albuquerque 

import java.util.Scanner;

public class trabalhoFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        char tabuleiro[][] = new char[6][7];

        escolherCor(teclado, tabuleiro);
    }

    public static void limparTabuleiro(char tabuleiro[][]) {
        
        for (int l = 0; l < 6; l++) {
            for (int c = 0; c < 7; c++) {
                tabuleiro[l][c] = 'B';
            }
        }
    }

    public static void escolherCor(Scanner teclado, char tabuleiro[][]) {

        limparTabuleiro(tabuleiro);

        System.out.println("Escolha a sua cor ( V - vermelho | A - azul ): ");
        String corJogadorS = teclado.next().toUpperCase();

        char corComputador = ' ';

        while ( !corJogadorS.equals("A") && !corJogadorS.equals("V") ) {
            System.out.println("Valor incorreto. Por favor, escolha a sua cor novamente (V - vermelho | A - azul): ");
            corJogadorS = teclado.next().toUpperCase();
        }

        if (corJogadorS.equals("V")) {
            corComputador = 'A';
        } else if (corJogadorS.equals("A")) {
            corComputador = 'V'; 
        }
            
        char corJogador = corJogadorS.charAt(0);

        seguirAdiante(teclado, tabuleiro, corComputador, corJogador);
    }
        
    public static void seguirAdiante(Scanner teclado, char tabuleiro[][], char corComputador, char corJogador) {

        boolean vencedor = false;

        while (vencedor == false) {
            System.out.println("1 - Imprimir tabuleiro | 0 - Seguir adiante: ");
            char num = teclado.next().charAt(0);

            if (num == '1') {
                imprimirTabuleiro(tabuleiro);
            } else if (num == '0') {
                vezJogador(teclado, corJogador, tabuleiro);
                vezComputador(corComputador, tabuleiro);
                if (encerrarJogo(teclado, tabuleiroCompleto(tabuleiro), jogoFinalizado(tabuleiro), tabuleiro)) {
                    vencedor = true; } 
                    } else {
                        System.out.print("Valor incorreto. Por favor, informe: "); 
                    }
        }
    }
    
    public static void imprimirTabuleiro(char tabuleiro[][]) {

        for (int i = 0; i < 7 - 1; i++) {
            System.out.print("------");
        }

        System.out.println();

        for (int l = 0; l < 6; l++) {
            for (int c = 0; c < 7; c++) {
                System.out.print("|  " + tabuleiro[l][c] + " ");
            } 
            System.out.println("|");
        }

        for (int i = 0; i < 7 - 1; i++) {
            System.out.print("------");
        }

        System.out.println();
    }

    public static void vezJogador(Scanner teclado, char corJogador, char tabuleiro[][]) {

        int posicaoJogador = -1;

        while (true) {
        System.out.println("Escolha a coluna (1-7) para incluir a sua peça: ");
        posicaoJogador = teclado.nextInt();

            if (posicaoJogador < 1 || posicaoJogador > 7) {
                System.out.print("Coluna inexistente. Por favor, ");
            } else if (colunaCheia(tabuleiro, posicaoJogador)) {
                System.out.print("A coluna está cheia. Por favor, ");
                } else {
                    break; 
                }
        }

        incluirPosicaoJogador(tabuleiro, corJogador, posicaoJogador);
        imprimirTabuleiro(tabuleiro);
    }

    public static void vezComputador(char corComputador, char tabuleiro[][]) {

        int posicaoComputador = -1;

        while (posicaoComputador < 1 || posicaoComputador > 7 || colunaCheia(tabuleiro, posicaoComputador)) {
            posicaoComputador = (int) (Math.random() * 7) + 1;
        }

        incluirPosicaoComputador(tabuleiro, corComputador, posicaoComputador);
        imprimirTabuleiro(tabuleiro);
    }

    public static void incluirPosicaoJogador(char tabuleiro[][], char corJogador, int posicaoJogador) {

        for (int i = 5; i >= 0; i--) {
            if (tabuleiro[i][posicaoJogador - 1] == 'B') {
                tabuleiro[i][posicaoJogador - 1] = corJogador;
                break;
            }
        }
    }

    public static void incluirPosicaoComputador(char tabuleiro[][], char corComputador, int posicaoComputador) {

        for (int i = 5; i >= 0; i--) {
            if (tabuleiro[i][posicaoComputador - 1] == 'B') {
                tabuleiro[i][posicaoComputador - 1] = corComputador;
                break;
            }
        }
    }

    public static boolean colunaCheia(char tabuleiro[][], int coluna) {

        if (tabuleiro[0][coluna - 1] != 'B') {
            return true;
            } else {
                return false;  
            }
    }

    public static boolean jogoFinalizado(char tabuleiro[][]) {

        if (verificaVitoriaHorizontal(tabuleiro) || verificaVitoriaVertical(tabuleiro)
                || verificaVitoriaDiagonalDireita(tabuleiro) || verificaVitoriaDiagonalEsquerda(tabuleiro)
                || tabuleiroCompleto(tabuleiro)) {
            return true;
        } 
             return false;
    }

    public static boolean verificaVitoriaHorizontal(char tabuleiro[][]) {

        
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                char cor = tabuleiro[linha][coluna];
                if (cor != 'B' && cor == tabuleiro[linha][coluna + 1] && cor == tabuleiro[linha][coluna + 2]
                        && cor == tabuleiro[linha][coluna + 3]) {
                    System.out.println("Vitória horizontal! \nCor: " + cor);
                    return true;  
          
                }
            }
        }
        return false;
    }

    public static boolean verificaVitoriaVertical(char tabuleiro[][]) {

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                char cor = tabuleiro[linha][coluna];
                if (cor != 'B' && cor == tabuleiro[linha + 1][coluna] && cor == tabuleiro[linha + 2][coluna]
                        && cor == tabuleiro[linha + 3][coluna]) {
                    System.out.println("Vitória vertical! \nCor: " + cor);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean verificaVitoriaDiagonalDireita(char tabuleiro[][]) {

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                char cor = tabuleiro[linha][coluna];
                if (cor != 'B' && cor == tabuleiro[linha + 1][coluna + 1] && cor == tabuleiro[linha + 2][coluna + 2]
                        && cor == tabuleiro[linha + 3][coluna + 3]) {
                    System.out.println("Vitória diagonal direita! \nCor: " + cor);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean verificaVitoriaDiagonalEsquerda(char tabuleiro[][]) {

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 3; coluna < 7; coluna++) {
                char cor = tabuleiro[linha][coluna];
                if (cor != 'B' && cor == tabuleiro[linha + 1][coluna - 1] && cor == tabuleiro[linha + 2][coluna - 2]
                        && cor == tabuleiro[linha + 3][coluna - 3]) {
                    System.out.println("Vitória diagonal esquerda! \nCor: " + cor);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean tabuleiroCompleto(char tabuleiro[][]) {

        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (tabuleiro[linha][coluna] == 'B') {
                    return false;
                }
            }
        }

        System.out.println("EMPATE!");

        return true;
    }

     
    public static boolean encerrarJogo(Scanner teclado, boolean tabuleiroCompleto, boolean jogoFinalizado, char tabuleiro[][]) {
        boolean reinicie = false;

        if (tabuleiroCompleto == true || jogoFinalizado == true) {
            System.out.println("Deseja jogar novamente? ( 1 - jogar novamente | Qualquer outro número para encerrar.)");
            int reiniciar = teclado.nextInt();

            if (reiniciar == 1) {
               reinicie = false; 
               limparTabuleiro(tabuleiro);
                } else {
                    reinicie = true;
                }
        }
            
        if (reinicie == true) {
            return true; 
            } else {
                return false;
            }
    }
}