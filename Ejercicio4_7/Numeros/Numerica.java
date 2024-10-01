package Ejercicio4_7.Numeros;

public abstract class Numerica {
    public abstract String toSting();
    public abstract boolean equals(Object o);
    public abstract Numerica Sumar(Numerica num);
    public abstract Numerica Resta(Numerica num);
    public abstract Numerica Multiplicar(Numerica num);
    public abstract Numerica Dividir(Numerica num);
}
