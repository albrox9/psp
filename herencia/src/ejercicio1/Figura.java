package ejercicio1;

import lombok.Data;

@Data
public abstract class  Figura implements I_Figura {

    protected double[] lados;
    protected  double area;
    protected double perimetro;

    public abstract double calcularPerimetro(double[] lados);

    public abstract double calcularArea(double[] lados);




}
