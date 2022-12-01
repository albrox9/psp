import java.io.*;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        String ruta = "C://Users//alumno//Desktop//f.txt";



       List<String> listaAlumno =FicheroLectorEscritorAltoNivel.lecturaAltoNivel(ruta);

        for (String frase : listaAlumno) {

            System.out.println(frase);

        }







}
}
