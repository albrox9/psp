import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lectura {

    public List<String> leer() throws IOException {

        String fichero = "C:\\miclase_psp\\notas.txt";

        FileReader lectorBajoNivel = new FileReader(fichero);
        BufferedReader lectorAltoNivel = new BufferedReader(lectorBajoNivel);

        String cadenaLeida = "";
        List<String> lecturaTotal = new ArrayList<String>();

        // Detectar fin de fichero con null a través del método readLine.
        // El lector de alto nivel modo texto SÍ puede leer cadenas, cosa
        // que el de bajo no podía (recuperaba enteros -Unicode- hasta detectar -1).
        while( (cadenaLeida = lectorAltoNivel.readLine())  != null) {
            lecturaTotal.add(cadenaLeida);
        }

        System.out.println(lecturaTotal);

        lectorAltoNivel.close();// cierre implícito de los bajos.

        return lecturaTotal;
    }

}

