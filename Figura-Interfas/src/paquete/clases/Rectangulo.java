package paquete.clases;

public class Rectangulo implements FiguraGeometrica {
    private double ladoLargo;
    private double ladoCorto;

    public Rectangulo(double ladoLargo, double ladoCorto) {
        this.ladoLargo = ladoLargo;
        this.ladoCorto = ladoCorto;
    }

    public double getLadoLargo() {
        return ladoLargo;
    }

    public double getLadoCorto() {
        return ladoCorto;
    }

    @Override
    public double calcularArea() {
        return ladoLargo * ladoCorto;
    }

    @Override
    public String toString() {
        return String.format("Rectángulo [Largo: %.2f, Corto: %.2f, Área: %.2f]", ladoLargo, ladoCorto, calcularArea());
    }
}
