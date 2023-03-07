package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicio1 {

    Scanner sc = new Scanner(System.in);

    public void atv1() {
        System.out.println(" Digite o primeiro valor!! ");
        int Numero1 = sc.nextInt();
        System.out.println(" Digite o segundo valor!! ");
        int Numero2 = sc.nextInt();
        if (Numero1>Numero2){
            System.out.println("Maior valor é " +Numero1);
        } else {
            System.out.println("Maior valor é " +Numero2);
        }
    }

    public void atv2() {
        System.out.println(" Digite Seu Ano de Nascimento!! ");
        int AnoNascimento = sc.nextInt();
        System.out.println(" Digite o Ano Atual!! ");
        int AnoAtual = sc.nextInt();
        double Idade = AnoAtual-AnoNascimento;
          if ( Idade >= 16  ) {
            System.out.println(" Podera Votar!! ");
        } else {
            System.out.println(" Não Podera Votar!! ");
        }

    }

    public void atv3() {
        System.out.println(" Digite a Senha!!! ");
        int Senha = sc.nextInt();
        if ( Senha == 1234 ){
        System.out.println(" Acesso Permitido!!! ");
        } else {
            System.out.println(" Acesso Negado!!! ");
        }

    }

    public void atv4() {
        System.out.println(" Quantas maçãs foram compradas? ");
        double quantidade = sc.nextDouble();
        double valor;
        if (quantidade >= 12) {
            valor = 0.25;
        } else {
            valor = 0.30;
        }
        double valorTotal = quantidade * valor;
        System.out.println(" O valor total da compra é de " + valorTotal);

    }

    public void atv5() {
        System.out.println(" Digite o primeiro número!! ");
        int Numero1 = sc.nextInt();
        System.out.println(" Digite o segundo número!! ");
        int Numero2 = sc.nextInt();
        System.out.println(" Digite o terceiro número!! ");
        int Numero3 = sc.nextInt();
               if (Numero1<Numero2 && Numero1<Numero3 && Numero2<Numero3) {
            System.out.println(" Sequência é " +Numero1+Numero2+Numero3);
        } else if (Numero2<Numero3 && Numero2<Numero1 && Numero1<Numero3) {
            System.out.println(" Sequência é " +Numero2+Numero1+Numero3);
        } else if (Numero3<Numero1 && Numero3<Numero2 && Numero1<Numero2) {
            System.out.println(" Sequência é " +Numero3+Numero1+Numero2);
        } else if (Numero1<Numero2 && Numero1<Numero3 && Numero3<Numero2) {
            System.out.println(" Sequência é "+Numero1+Numero3+Numero2);
        } else if (Numero2<Numero3 && Numero2<Numero1 && Numero3<Numero1) {
            System.out.println(" Sequência é " +Numero2+Numero3+Numero1);
        }  else {
            System.out.println(" Sequência é " +Numero3+Numero2+Numero1);
        }
    }
    public void atv6() {
    System.out.println(" Se for mulher digite 1! Se for homem digite 2! ");
    int sexo = sc.nextInt();
    System.out.println(" Digite sua altura!! ");
    double altura = sc.nextDouble();
     if (sexo==1){
        System.out.println(" Seu peso ideal é " + ((62.1*altura)- 44.7));
     } else {
        System.out.println(" Seu peso ideal é " + ((72.7*altura)- 58));
     }
    } 
}
