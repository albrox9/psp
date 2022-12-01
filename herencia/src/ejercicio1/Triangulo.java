package ejercicio1;



public class Triangulo extends Figura {

    private double base;
    private double altura;

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
        super.area = (this.base * this.altura) / 2;
        return super.area;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangulo{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
}
