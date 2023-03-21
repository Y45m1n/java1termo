package AtividadeRemota;

import java.util.Scanner;

public class ExtrasIfElse {
    Scanner sc = new Scanner(System.in);
    public void atvd1() {  //Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!
        System.out.println(" Digite um valor!! ");
        double valor = sc.nextDouble();
        if ( valor >= 10 ) {
         System.out.println(valor + " É MAIOR QUE 10! ");
        } else {
            System.out.println(valor + " NÃO É MAIOR QUE 10! ");
        }
    }
    public void atvd2() { //A jornada de trabalho semanal de um funcionário é de 40 horas. 
        //O funcionário que trabalhar mais de 40  horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
        //Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, 
        //que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 5 semanas exatas 5x40 = 200 horas mês).
        
    }

    public void atvd3() { //Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
        // Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 2.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
        
    }

    public void atvd4() {//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
        // Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). 
        //Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
        
    }
    
}
