import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class LeerArchivo {
    public static void main(String[] args) {
        String ruta = "datos.txt";
        try{
            BufferedReader lector = new BufferedReader(new FileReader(ruta));

        }catch (FileNotFoundException fnfe){
            System.out.println("El archivo no existe !!");
            System.out.println(fnfe.getMessage());
        }


    }
}
