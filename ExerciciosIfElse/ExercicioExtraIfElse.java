package ExerciciosIfElse;
import java.lang.constant.Constable;
import java.util.Scanner;

public class ExercicioExtraIfElse {

    private static final String A = null;
    Scanner sc = new Scanner(System.in);

    public void extra1() {
       System.out.println(" Digite um numero!! "); 
       int numero = sc.nextInt();
    double moduloOuResto = numero%2;
    if (moduloOuResto == 0) {
        System.out.println(" O número é par!! ");
    } else {
        System.out.println(" O número é impar!! ");
    }
}
public void extra2() {
    System.out.println( " Informe a nota 1 do aluno " );
        int nota1 = sc.nextInt();
        System.out.println( " Informe a nota 2 do aluno " );
        int nota2 = sc.nextInt();
        double mediaAluno = (nota1+nota2)/2;
        if (mediaAluno>7) {
            System.out.println(" Aluno passou DIRETOOOO!! ");
        } else if (mediaAluno>=5 && mediaAluno<=7) {
            System.out.println(" Precisa fazer Recuperaçãooo!! ");
        } else {
            System.out.println(" Aluno reprovado DIRETOOOO!! ");
        }
    }
    public void extra3() {
    System.out.println(" Digite a letra!! ");
    String letra = sc.next();
    //Vogal == (A,E,I,O,U);
      if (letra == A E) {
    System.out.println(" É consoante!! ");
      } else {
        System.out.println(" É vogal!! ");
      }
    

    }



}