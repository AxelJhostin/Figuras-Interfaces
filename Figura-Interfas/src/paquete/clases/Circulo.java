package paquete.clases;

public class Circulo implements FiguraGeometrica {
    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    @Override
    public double calcularArea() {
        double radio = diametro / 2;
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return String.format("Círculo [Diámetro: %.2f, Área: %.2f]", diametro, calcularArea());
    }
}
