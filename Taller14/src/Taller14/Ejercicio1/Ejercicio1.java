package Taller14.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Figura circulo = new Circulo(3.5);
        Figura rectangulo = new Rectangulo(4.0, 5.0);

        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}
