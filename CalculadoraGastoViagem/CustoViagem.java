package CalculadoraGastoViagem;

public class CustoViagem {
   public static void main(String[] args) {
    System.out.println("Calculo do gasto da Viagem ");
    double distanciaPercorrida=200;
    System.out.println(" A Distância Percorrida foi de " + distanciaPercorrida + "KM");
    double precoCombustivel = 5;
    System.out.println(" O Preco do combustivel é de " + precoCombustivel + "$");
    double consumoCarro=10;
    System.out.println(" O consumo do carro é de " + consumoCarro + "KM/L");
    double gastoLitros= distanciaPercorrida/consumoCarro;
    System.out.println(" O Gasto em Litros foi de " + gastoLitros + "L" );
    double gastoTotal= gastoLitros*precoCombustivel;
    System.out.println(" O Gasto Total foi de " + gastoTotal + "$");
   } 
}
