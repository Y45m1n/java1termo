package ExerciciosIfElse;

import java.util.Scanner;

public class ExercicioFrequenciaIfElse {
    Scanner sc= new Scanner(System.in);
    public void calcular (){
        System.out.println( " Informe a nota 1 do aluno " );
        int nota1 = sc.nextInt();
        System.out.println( " Informe a nota 2 do aluno " );
        int nota2 = sc.nextInt();
        double mediaAluno = (nota1+nota2)/2;
        if ( mediaAluno >=50 ) {
            System.out.println(" O Aluno está Aprovado!! ");
        } else {
            System.out.println(" O Aluno não está Aprovado!! ");
        } 
        System.out.println(" Informe a frequência do aluno ");
        int frequênciaAluno = sc.nextInt();
        if( frequênciaAluno >=75 ){
            System.out.println(" O aluno está aprovado por frequência!! ");
        } else {
            System.out.println(" O Aluno não está aprovado por frequência!! ");
        }
        System.out.println(" O aluno está aprovado no curso? ");
        if (mediaAluno >=50 && frequênciaAluno >=75 ) {
            System.out.println(" O aluno está aprovado no curso!! ");
        } else {
            System.out.println(" O aluno não está aprovado no curso!! ");
        }
        
    }
}
