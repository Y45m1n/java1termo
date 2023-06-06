package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(8);
        Retangulo figura2 = new Retangulo(10, 5);
     //   Trapezio figura3 = new Trapezio(4, 4, 0, 0, 5);
        System.out.println(figura1.getNomeFigura()   
                             +"/n Area: "+figura1.getArea()
                             +"/n Perímetro: "+figura1.getPerimetro());
        System.out.println(figura1.getNomeFigura()
                             +"/n Area: "+figura2.getArea()
                             +"/n Perimetro: "+figura2.getPerimetro());
    }
}
