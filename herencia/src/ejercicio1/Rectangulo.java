package ejercicio1;

import java.util.Arrays;

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    static String nombre;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro(double[] lados) {
        return 0;
    }

    @Override
    public double calcularArea(double[] lados) {
        this.base = lados[0];
        this.altura = lados [1];
        super.area = (this.base * this.altura);
        return super.area;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
}
