package Operadores;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc= new Scanner (System.in);
    public void calcular (){
        System.out.println( " Infome a nota 1 do aluno " );
        int nota1 = sc.nextInt();
        System.out.println( " Infome a nota 2 do aluno " );
        int nota2 = sc.nextInt();
        //operação aritmética
        double mediaAluno = (nota1+nota2)/2;
        //operações atribuição
        // mediaAluno = nota1;
        // mediaAluno += nota2;
        // mediaAluno /= 2;
        System.out.println(" A media do aluno é " + mediaAluno);
        //operacão relacional
        boolean mediaAprovada = mediaAluno>=50;
        System.out.println( " O aluno está aprovado por nota? " +mediaAprovada);
        System.out.println(" Informe a frequência do aluno ");
        int frequênciaAluno = sc.nextInt();
        boolean frequenciaAprovada = frequênciaAluno>=75;
        System.out.println(" O aluno está aprovado por frequência? " +frequenciaAprovada);
        // Opercao lógica
        boolean resultadoFinal = (mediaAprovada==true) && (frequenciaAprovada==true);
        System.out.println(" O aluno está aprovado no curso? " +resultadoFinal);
    }
}
