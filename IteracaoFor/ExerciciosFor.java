package IteracaoFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);


    public void atvd1() {
        int[] vetor = new int[5];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição ["+i+"] ");
            vetor[i] = sc.nextInt();
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.println(" Os valores são: ["+i+"] "+vetor[i]);
        }
       
       
}
}
