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
    novoValores[0]=10;
    novoValores[1]=20;
    novoValores[2]=35;
    novoValores[3]=67;
    novoValores[4]=98;
    System.out.println(" O vetor é : posição [0]= " +novoValores[0]);
    System.out.println(" O vetor é : posição [1]= " +novoValores[1]);
    System.out.println(" O vetor é : posição [2]= " +novoValores[2]);
    System.out.println(" O vetor é : posição [3]= " +novoValores[3]);
    System.out.println(" O vetor é : posição [4]= " +novoValores[4]);
   }
   public void exemplo3 () {


   }
   public void exemplo4 () {
    System.out.println(" Digite sua 1° nota!! ");
    double nota1 = sc.nextDouble();
    System.out.println(" Digite sua 2° nota!! ");
    double nota2 = sc.nextDouble();
    System.out.println(" Digite sua 3° nota!! ");
    double nota3 = sc.nextDouble();
    System.out.println(" Digite sua 4° nota!! ");
    double nota4 = sc.nextDouble();

    double nota[] = new double [] {nota1 + nota2 + nota3 + nota4 };
    System.out.println(" Suas notas são: " +nota);
   }
}
