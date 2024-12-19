package paquete.clases;

public interface FiguraGeometrica {
    double calcularArea();

    default boolean mayorQue(FiguraGeometrica otraFigura) {
        return this.calcularArea() > otraFigura.calcularArea();
    }

    @Override
    String toString();
}
