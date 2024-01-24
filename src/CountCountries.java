import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("CSV/Colfuturo-Seleccionados (2).csv"));
        String line;
        Map<String,Integer> paisesYAlumnos = new HashMap<>();
        while ((line = reader.readLine())!=null) {
            String[] separado = line.split(",");
            String pais = separado[6];
            if (!paisesYAlumnos.containsKey(pais)){
                paisesYAlumnos.put(pais,1);
            }else {
                paisesYAlumnos.put(pais, paisesYAlumnos.get(pais) +1);
            }
        }
        reader.close();
        System.out.println(paisesYAlumnos);
    }
}
