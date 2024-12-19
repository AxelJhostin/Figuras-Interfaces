package paquete.clases;

public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return String.format("Triángulo [Base: %.2f, Altura: %.2f, Área: %.2f]", base, altura, calcularArea());
    }
}
