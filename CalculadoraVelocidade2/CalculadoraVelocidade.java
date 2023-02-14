package CalculadoraVelocidade2;
import java.util.Scanner;
public class CalculadoraVelocidade {
    Scanner sc = new Scanner(System.in);
    public void calcular() {
        System.out.println("Informe a Distância Percorrida");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("Informe o Tempo Gasto");
        double tempoGasto = sc.nextDouble();
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("A Velocidade Média foi de" + velocidadeMedia + "Km/h");
    }
   public void destino() {
    System.out.println("Informe seu Local de Partida");
    String partida = sc.next();
    System.out.println( "Informe seu Local de Destino");
    String destino = sc.next();
    System.out.println("A Sua Viagem vai de " + partida + " a " + destino );
   }      
}
