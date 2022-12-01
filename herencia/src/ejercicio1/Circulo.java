package ejercicio1;


public class Circulo extends Figura{

    private double radio;



    @Override
    public double calcularPerimetro(double[] lados) {


        this.radio = lados[0];
        super.perimetro = this.radio * 2 * Math.PI;

        return super.perimetro;
    }

    @Override
    public double calcularArea(double[] lados) {

        this.radio = lados[0];
        super.area = Math.pow(this.radio, 2);

        return super.area;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circulo{");
        sb.append("radio=").append(radio);
        sb.append(", perimetro=").append(super.perimetro);
        sb.append('}');
        return sb.toString();
    }
}
