import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Lectura l = new Lectura();
        List<Alumno> listAlumno = new ArrayList<Alumno>();
        List<String> nuevaLista = l.leer();

        for (String frase: nuevaLista) {
            String[] dato = frase.split(";");
            listAlumno.add(new Alumno(dato[0],Integer.parseInt(dato[1]), Integer.parseInt(dato[2])));
        }

        System.out.println(listAlumno);
    }
}

