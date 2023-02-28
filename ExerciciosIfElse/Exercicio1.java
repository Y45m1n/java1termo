package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicio1 {

    Scanner sc = new Scanner(System.in);

    public static void atv1() {

    }

    public void atv2() {
        System.out.println(" Digite Sua Idade!! ");
        int Idade = sc.nextInt();
        if ( Idade >= 16 ) {
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

    }

    public void atv6() {

    }
}
