import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContarPaises
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/INFORMATICA/alu10728702/Baixades/Colfuturo-Seleccionados (1).csv"));
        String line;
        Map<String,Integer> paisesAlumnos = new HashMap<>();
        while ((line = reader.readLine())!=null) {
            String[] arrayInformacion = line.split(",");
            String pais = arrayInformacion[6];
            Integer cuantos = paisesAlumnos.get(pais);

            if (cuantos == null){
                paisesAlumnos.put(pais,1);
            }else {
                paisesAlumnos.put(pais,++cuantos);
            }
        }
        System.out.println(paisesAlumnos);
        reader.close();
    }
}
