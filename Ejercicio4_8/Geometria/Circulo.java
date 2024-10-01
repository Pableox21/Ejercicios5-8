package Ejercicio4_8.Geometria;
public class Circulo extends FiguraGeometrica{
    int radio;
    Circulo (int radio){
        this.radio=radio;
    }

    @Override
    public double area() {
        return  Math.PI*Math.pow(radio,2);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }
}
