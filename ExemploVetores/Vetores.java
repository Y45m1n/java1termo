package ExemploVetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc  = new Scanner(System.in);
   //criando metodo
   public void exemplo1 (){
   //criando um vetor
   double[] valores = new double[] {10.5,20.7,30.6,40.4};
   System.out.println( "1° Posição- Índice [0]:"+ valores[0] );
   System.out.println( "2° Posição- Índice [1]:"+ valores[1] );
   System.out.println( "3° Posição- Índice [2]:"+ valores[2] );
   System.out.println( "4° Posição- Índice [3]:"+ valores[3] );
   //mudando valores de uma posição definida
   valores[0] = 15.6; //Mudando o valor do índice
   System.out.println( "1° Posição- Índice [0]:"+ valores[0] );
   }  
   public void exemplo2 () {
    //criando vetor
    int[] novoValores = new int[5];  //declarei que tem 5 posições
    // int novoValores[]=new int[5];
    System.out.println("Preencha o vetor de 5 posições");
    novoValores[0]=sc.nextInt();// 1º posição indice 0
    novoValores[1]=sc.nextInt();// 2º posição indice 1
    novoValores[2]=sc.nextInt();// 3º posição indice 2
    novoValores[3]=sc.nextInt();// 4º posição indice 3
    novoValores[4]=sc.nextInt();// 5º posição indice 4
    System.out.println("O valor da 1º posição indice 0 é "+ novoValores[0]);
    System.out.println("O valor da 2º posição indice 1 é "+ novoValores[1]);
    System.out.println("O valor da 3º posição indice 2 é "+ novoValores[2]);
    System.out.println("O valor da 4º posição indice 3 é "+ novoValores[3]);
    System.out.println("O valor da 5º posição indice 4 é "+ novoValores[4]);

    //novoValores[0]=10;
    //novoValores[1]=20;
    //novoValores[2]=35;
    // novoValores[3]=67;
    // novoValores[4]=98;
    // System.out.println(" O vetor é : posição [0]= " +novoValores[0]);
    //System.out.println(" O vetor é : posição [1]= " +novoValores[1]);
    //System.out.println(" O vetor é : posição [2]= " +novoValores[2]);
    // System.out.println(" O vetor é : posição [3]= " +novoValores[3]);
    //System.out.println(" O vetor é : posição [4]= " +novoValores[4]);
   }
   public void exemplo3 () {
    double[] nValores = new double[10];
    System.out.println("Preencha o vetor de 10 posições");
    nValores[0]=sc.nextDouble();
    nValores[1]=sc.nextDouble();
    nValores[2]=sc.nextDouble();
    nValores[3]=sc.nextDouble();
    nValores[4]=sc.nextDouble();
    nValores[5]=sc.nextDouble();
    nValores[6]=sc.nextDouble();
    nValores[7]=sc.nextDouble();
    nValores[8]=sc.nextDouble();
    nValores[9]=sc.nextDouble();
    System.out.println("O valor da 10º posição indice 9 é "+ nValores[9]);
    System.out.println("O valor da 9º posição indice 8 é "+ nValores[8]);
    System.out.println("O valor da 8º posição indice 7 é "+ nValores[7]);
    System.out.println("O valor da 7º posição indice 6 é "+ nValores[6]);
    System.out.println("O valor da 6º posição indice 5 é "+ nValores[5]);
    System.out.println("O valor da 5º posição indice 4 é "+ nValores[4]);
    System.out.println("O valor da 4º posição indice 3 é "+ nValores[3]);
    System.out.println("O valor da 3º posição indice 2 é "+ nValores[2]);
    System.out.println("O valor da 2º posição indice 1 é "+ nValores[1]);
    System.out.println("O valor da 1º posição indice 0 é "+ nValores[0]);

   }
   public void exemplo4 () {
    double[] notas = new double [4];
    System.out.println(" Digite suas 4 notas!! ");
    notas[0]=sc.nextDouble();
    notas[1]=sc.nextDouble();
    notas[2]=sc.nextDouble();
    notas[3]=sc.nextDouble();
    System.out.println("Sua 1º nota é "+ notas[2]);
    System.out.println("Sua 2º nota é "+ notas[1]);
    System.out.println("Sua 3º nota é "+ notas[0]);
    double [] notaMedia = new double [4];
    // notaMedia = (notas [0] + notas[1] + notas [2] + notas[4]) ;
    System.out.println(" Suas notas são: " +notaMedia);
   }
}
