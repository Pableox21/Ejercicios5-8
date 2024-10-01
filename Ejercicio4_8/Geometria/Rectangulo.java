package Ejercicio4_8.Geometria;
public class Rectangulo extends FiguraGeometrica{
    int base;
    int altura;
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return base * altura;
    }
    @Override
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }
}
