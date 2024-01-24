import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagramas {
    public static String alfabetizar (String line){
        char[] caracteres = line.toCharArray();
        Arrays.sort(caracteres);
        return new String(caracteres);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("CSV/spanish-dict (1).txt"));
        String line;

        while ((line = reader.readLine())!=null) {
            String palabraAlfabetizada = alfabetizar(line);
            Map<String,List<String>> total = new HashMap<>();
            List<String> anagramas = new ArrayList<>();

            if (total.get(anagramas) == null){

            }
        }
        reader.close();
    }
}
