package MatrizesExercicios;

import java.util.Random;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class ExercicioExtraMatrizes {
    // Faça um programa que preencha uma matriz 4 x 4 com o resultado da
    // multiplicação do valor da linha(i) e da coluna(j) de cada elemento.
    // Em seguida, imprima na tela a matriz.
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(10);

    public void exercicio1() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }
    // Leia uma matriz 4 x 4(random), imprima a matriz e retorne a localização
    // (linha e a coluna) do maior valor.

    public void exercicio2() {
        int matriz[][] = new int[4][4];
        int pColuna = 0;
        int pLinha = 0;
        int maiorValor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(10);
                if (matriz[i][j] >= maiorValor) {
                    maiorValor = matriz[i][j];
                    pColuna = j + 1;
                    pLinha = i + 1;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println(
                "O maior valor: " + maiorValor + " está localizado na linha " + pLinha + " e na coluna " + pColuna);
    }

    // Leia uma matriz 5 x 5(random). Leia também um valor X.
    // O programa deverá fazer uma busca desse valor na matriz e, ao final, escrever
    // a localização (linha e coluna)
    // ou uma mensagem de “não encontrado”.

    public void exercicio3() {

        int matriz[][] = new int[5][5];
        int pLinha = 0;
        boolean encontrado;
        int pColuna = 0;

        System.out.println("Digite um número de 1 a 10");
        int valorX = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (valorX == matriz[i][j]) {
                    encontrado = true;
                    pColuna = j + 1;
                    pLinha = i + 1;
                    if (encontrado = true) {
                        System.out.println("Valor X encontrado na linha: " + pLinha + " e na coluna: " + pColuna);
                    } else {
                        System.out.println("Valor X não encontrado");
                    } // não aparece nada quando não tem o numero na matriz
                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

    }

    // Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos são da
    // forma:
    // A[i][j] = 2i + 7j − 2 se i < j;
    // A[i][j] = 3i² − 1 se i = j;
    // A[i][j] = 4i³ − 5j² + 1 se i > j.

    public void exercicio4() {
        int matriz[][] = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j) {
                    matriz[i][j] = (2 * i + 7 * j - 2);
                } else if (i == j) {
                    matriz[i][j] = (3 * i * i - 1);
                } else if (i > j) {
                    matriz[i][j] = (4 * i * i * i - 5 * j * j + 1);
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

    }
    // Faça um programa que leia uma matriz de 5 linhas e 4 colunas contendo as
    // seguintes informações sobre alunos de uma disciplina,
    // sendo todas as informações do tipo inteiro:
    // Primeira coluna: número de matrícula (use um inteiro); Segunda coluna: média das provas
    // Terceira coluna: média dos trabalhos; Quarta coluna: nota final

    public void exercicio5() {
        int matriz[][] = new int[5][4];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();






    }
}
