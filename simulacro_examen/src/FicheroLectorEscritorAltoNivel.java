import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FicheroLectorEscritorAltoNivel {

public static List<String> lecturaAltoNivel (String ruta) throws IOException {

    String cadenaLeida = "";
    List<String> listaCadena = new ArrayList<String>();
    //String lecturaTotal = "";

    FileReader lectorBajoNivel = new FileReader(ruta);
    BufferedReader lectorAltoNivel = new BufferedReader(lectorBajoNivel);



    // Detectar fin de fichero con null a través del método readLine.
    // El lector de alto nivel modo texto SÍ puede leer cadenas, cosa
    // que el de bajo no podía (recuperaba enteros -Unicode- hasta detectar -1).
    while((cadenaLeida = lectorAltoNivel.readLine()) != null) {
        System.out.println("CADENA LEIDA ---> " + cadenaLeida + "\n");
        listaCadena.add(cadenaLeida);
        System.out.println("\n");
    }

    lectorAltoNivel.close();
    return listaCadena;
}
}
