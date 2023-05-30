package POOInterface;

public class Retangulo implements FigurasGeometricas {
    //atributos do retangulo 
    int base ;
    int altura;

    //construtor
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base*altura;
    }
    
    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }
    @Override
    public double getPerimetro() {
        return (base+altura)*2;
    }
    
}
