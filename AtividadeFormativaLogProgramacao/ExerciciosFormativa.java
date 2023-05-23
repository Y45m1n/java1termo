package AtividadeFormativaLogProgramacao;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosFormativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(10);

    public void atvd1() {
        // Crie uma Classe que crie uma Matriz de Linha determinada pelo Usuário e
        // Coluna determinadas pelo Usuário
        // Preencha a Matriz com valores aleatórios entre 0 e 9 e imprimia a matriz
        // Substitua os valores da matriz anterior pelo seguinte sistema: se i>j valor =
        // 1; se i==j valor = 0; se j>i valor = 2
        System.out.println("Informe a quantidade de linhas e a quantidade de colunas ");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int classe[][] = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                classe[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.print(classe[i][j] + " ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    classe[i][j] = 1;
                } else if (i == j) {
                    classe[i][j] = 0;
                } else if (j > i) {
                    classe[i][j] = 2;
                }
            }
        }

        System.out.println("---------------");

        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.print(classe[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void atvd2() {
        // Crie uma classe que:
        // Sorteie um número de 0 a 1000;
        // Peça um palpite ao usuário. Se ele errar, informe se o palpite é maior ou
        // menor do que o número sorteado.
        // Peça novos palpites até que o usuário acerte e, depois disso, mostre em
        // quantas tentativas ele acertou.
        int nAleatorio = rd.nextInt(1000);
        boolean tenteNovamente = true;
        int cont = 1;
        while (tenteNovamente) {
            System.out.println("Dê um palpite de 0 à 999");
            int nPalpite = sc.nextInt();
            if (nAleatorio == nPalpite) {
                System.out.println("PARABÉNS VOCÊ ACERTOU E GANHARÁ UM BELO NADAAAA");
            } else if (nAleatorio != nPalpite) {
                if (nPalpite > nAleatorio) {
                    System.out
                            .println("O palpite está errado, o número " + nPalpite + " é maior que o número sorteado");
                    cont++;
                } else {
                    System.out
                            .println("O palpite está errado, o número " + nPalpite + " é menor que o número sorteado");
                    cont++;
                }
            }
            System.out.println("Você tentou " + cont + " vezes");
        }
    }

    public void atvd3() {

        // Escreva um programa que:
        // Sorteie o tamanho de uma vetor de minimo 100 e máximo 1000
        // Construa o vetor
        // Liste o vetor com números aleatórios de 1 a 100
        // Exiba apenas os números pares do vetor
        // Exiba apenas os números ímpares do vetor
        // Exiba a quantidade de números pares existem nas posições ímpares do vetor
        // Exiba a quantidade de números ímpares existem nas posições pares do vetor

        
        int vetor[] = new int[rd.nextInt(900)+100];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100)+1;
        }

        int contImparNoPar=0;
        int contParNoImpar=0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2 ==1){
                System.out.println(vetor[i]);
                if(i%2 ==1){
                    contImparNoPar++;
                }
            }
        }
         
         for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2 ==0){
                System.out.println(vetor[i]);
                if(i%2 ==0){
                    contParNoImpar++;
                }
            }
        }
        for (int i = 1; i < vetor.length; i+=2) {
            if(vetor[i]%2==1){
                contImparNoPar++;
            }
        }
       
        for (int i = 0; i < vetor.length; i+=2) {
            if(vetor[i]%2==0){
                contParNoImpar++;
            }
        }
    }
}
