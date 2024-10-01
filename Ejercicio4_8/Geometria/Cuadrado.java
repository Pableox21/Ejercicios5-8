package Ejercicio4_8.Geometria;
public class Cuadrado extends FiguraGeometrica{
    int lado;
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    @Override
    public double area() {
        return lado*lado;
    }
    @Override
    public double perimetro() {
        return (4*lado);
    }
}
