package ejercicio1;

import java.util.*;

public class miPrimeraFigura {



    public static void main(String[] args) {

        while(!exit){

            menu();
            actionMenu();

        }


    }

    static boolean exit = false;
    static List <Figura> figuras = new ArrayList<>();
    static Map <Figura, Double> mapFigura = new HashMap<>();



    public static void pasoMapFigura(){

        for (Figura f: figuras) {

            mapFigura.put(f, f.area);

        }

    }

    public static void mostrarMap(){

        mapFigura.forEach((k,v) -> System.out.println("Figura: " + k + " Area: " + v));
    }



    public static void menu(){

        String menu = """
                ------CALCULADORA AREAS-PERIMETROS------
                ------1.Area cuadrado------
                ------2.Area rectangulo------
                ------3.Area triangulo------
                ------4.Longitud circunferencia------
                ------5.Area circulo------
                ------6.Salir------
                """;

        System.out.println(menu);


    }

    public static int recogeOpcion(){

        System.out.println("Dime tu opcion");
        return scan.nextInt();

    }


    public static void actionMenu(){

        switch (recogeOpcion()) {

            case 1:

                System.out.println("Introduce longitud del lado del cuadrado");
                double square = scan.nextDouble();

                double [] squareA = {square, square};
                Figura sq1 = new Rectangulo();
                double rs1 = sq1.calcularArea(squareA);

                figuras.add(sq1);

                System.out.println("Total: " + rs1); break;

            case 2:

                System.out.println(" Introduce la base del rectangulo ");
                double rectangleB = scan.nextDouble();

                System.out.println(" Dime la altura rectangulo ");
                double rectangleH = scan.nextDouble();

                double [] rectangleA = {rectangleB, rectangleH};
                Figura r1 = new Rectangulo();
                double rs2 = r1.calcularArea(rectangleA);

                figuras.add(r1);

                System.out.println("Resultado: " + rs2); break;

            case 3:

                System.out.println(" Introduce la base del triangulo");
                double triangleB = scan.nextDouble();

                System.out.println(" Dime la altura del triangulo ");
                double triangleH = scan.nextDouble();

                double [] triangleA = {triangleB, triangleH};
                Figura t1 = new Triangulo();
                double rs3 = t1.calcularArea(triangleA);

                figuras.add(t1);

                System.out.println("Resultado: " + rs3); break;

            case 4:

                System.out.println("Introduce el radio de la circunferencia");

                double radio = scan.nextDouble();
                double [] radioA = {radio};
                Figura c1 = new Circulo();
                double rs4 = c1.calcularPerimetro(radioA);

                figuras.add(c1);

                System.out.println("Resultado: " + rs4); break;

            case 5:

                System.out.println("Introduce el radio de la circunferencia");
                double radioC = scan.nextDouble();

                double [] arrayRadioA = {radioC};
                Figura c2 = new Circulo();
                double rs5 = c2.calcularArea(arrayRadioA);

                figuras.add(c2);

                System.out.println("Resultado: " + rs5); break;

            case 6:

                exit = true;
                pasoMapFigura();
                mostrarMap();
                System.out.println("Gracias pos su tiempo");

              break;

            default:
                System.out.println("Opcion incorrecta, revise el menu");


        }
    }



    static Scanner scan = new Scanner(System.in);

}
