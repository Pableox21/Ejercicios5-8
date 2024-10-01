package Ejercicio4_8.Geometria;

public class PrubaFiguras {
    public static void main(String args[]){
        Circulo figura1=new Circulo(2);
        Rectangulo figura2=new Rectangulo(1,2);
        Cuadrado figura3=new Cuadrado(3);
        System.out.println("El area del circulo es= "+figura1.area());
        System.out.println("El Perimetro del circulo es= "+figura1.perimetro());
        System.out.println();
        System.out.println("El area del rectangulo es= "+figura2.area());
        System.out.println("El Perimetro del rectangulo es= "+figura2.perimetro());
        System.out.println();
        System.out.println("El area del cuadrado es= "+figura3.area());
        System.out.println("El Perimetro del cuadrado es= "+figura3.perimetro());
        System.out.println();

    }

}
