package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;


public class ExemploWhile {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        int i=0;
        while(i<10) {
            System.out.println(" O nº da Iteração é " +i );
            i++; //para somar 1 ao i=0 ent vai virar i=1
        }
    }
    public void exemplo2() {
        int vetor[]= new int[10];
        int i=0; //criei o repetidor
       while (i<10) { //enquanto i menor que 10, vai informar o indice do vetor
        System.out.println(" Informe o valor do vetor ["+i+"]= ");
        vetor[i]=sc.nextInt();
        i++;
       }
       while(i>0){ //operação contraria da de cima
        i--;
        System.out.println(" vetor ["+i+"]= "+vetor[i]);
       }
}
    public void exemplo3() {
        Random rd = new Random(); //random numero aleatorio
        int nAleatorio = rd.nextInt(10)+1; //vai sortear um numero aleatorio, sempre somando 1. ent nao vai sortear 0
        boolean tenteNovamente = true;
        while (tenteNovamente){
            System.out.println(" Digite um n° de 1 a 10 ");
            int nDigitado = sc.nextInt();
            if (nDigitado==nAleatorio){
                System.out.println(" Acertouuuuuu!!! ");
                tenteNovamente = false;
            } else {
                System.out.println(" Errouuuuu!!! ");
            }
        }

    }
}