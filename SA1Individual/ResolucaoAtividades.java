package SA1Individual;

import java.util.Scanner;

public class ResolucaoAtividades {
    Scanner sc = new Scanner(System.in);
public void exercicio1() {
    //digitar o 1° numero
    System.out.println("Informe o 1° valor");
    double n1 = sc.nextDouble();
    // digitar o 2° numero
    System.out.println("Informe o 2° valor");
    double n2 = sc.nextDouble();
    //ctrl D, seleciona a mesma letra,numero ou palavra para editar tudo de uma vez
    // escolher a operação
    System.out.println("Informe a Operação Desejada");
    System.out.println("1-Adição; 2-Subtração; 3-Multiplicação; 4-Divisão;");
    int operacao = sc.nextInt();
    double resultado;

    if (operacao == 1) {
             resultado = n1+n2;
             System.out.println("O resultado é" + resultado);
    } else if (operacao == 2) {
       resultado=n1 - n2;
       System.out.println("O resultado é" + resultado);
    } else if (operacao == 3) {
       resultado=n1 * n2;
       System.out.println("O resultado é" + resultado);
    } else if (operacao == 4 && n2!=0 ) {
        resultado = n1 / n2;
        System.out.println("O resultado é" + resultado);
    } else {
       System.out.println("Operação inválida ou valor irregular");
    }
}
public void exercicio2() {
//declare o n° de matricula
System.out.println("informe seu n° de matricula");
int nMatricula = sc.nextInt();
//dividir por 4 pegar o resto
int grupo = nMatricula%4;
if (grupo==0){ //grupo%4==0
    System.out.println("Time do Chris");
} else if (grupo==1){//grupo%3==0
    System.out.println("time do Greg");
} else if (grupo==2) {//grupo%2==0
    System.out.println("Time do Caruso");
} else {
    System.out.println("Time do Jerome");
}
}
public void exercicio3() {
    //informa a quantidade de frutas
    System.out.println("Kg de Morango");
    double kgMorango = sc.nextDouble();
    System.out.println("Kg de Maca");
    double kgMaca = sc.nextDouble();
    System.out.println("Kg de Banana");
    double kgBanana = sc.nextDouble();
    double pesoTotal = kgBanana+kgMaca+kgMorango;
    double valorTotal = kgBanana*1.8+kgMaca*2.3+kgMorango*3.5;
    if (pesoTotal>=15 || valorTotal>=30){
        valorTotal = valorTotal-valorTotal*0.1;
    }
    System.out.println("o Valor da compra é R$"+ valorTotal);
}

}