package POOInterface;

public class Quadrado implements FigurasGeometricas {
//assinou um contrato com FigurasGeometricas
    //obrigatoriamente declarar os metodos da classe Figuras

    //atributos da classe quadrado

    int lado;

    //construtor com parametro
    public Quadrado(int lado) {
        this.lado = lado;
    }
    
    
    //metodos importados de FiguraGeometricas

    @Override //importa metodos e reescreve
    public double getArea() {
        int area =lado*lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro= 4*lado;
        return perimetro;
    }
    
    
}
