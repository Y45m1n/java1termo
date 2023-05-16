package MatrizesExercicios;

import java.util.Random;
import java.util.Scanner;

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
                matriz[i][j] = rd.nextInt(10);
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
    public void exercicio2(){
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(10);
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
    public void exercicio3(){
        
    }
}
