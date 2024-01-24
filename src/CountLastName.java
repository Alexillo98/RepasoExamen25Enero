import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("CSV/LastnameFrequencies.csv"));
        String line;
        Map<String,String> totalApellidos = new HashMap<>();
        Scanner escaner = new Scanner(System.in);
        String apellido = escaner.nextLine();


        while ((line = reader.readLine())!=null){
            String[] apellidos = line.split(",");
            if(apellidos.length == 2) {
                String cuantos = apellidos[1];
                totalApellidos.put(apellidos[0], cuantos);
            }
        }
        reader.close();
        if (totalApellidos.containsKey(apellido)) {
            System.out.println(totalApellidos.get(apellido));
        }else {
            System.out.println("No esta el apellido.");
        }
    }
}
