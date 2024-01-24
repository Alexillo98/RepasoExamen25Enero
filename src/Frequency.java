import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency
{
    public static String calcularFrecuencia (Scanner escaner){
        Map<String,Integer> repeticiones = new HashMap<>();
        String palabra = escaner.nextLine();

        while (!palabra.isEmpty())
        {
            Integer contador = repeticiones.get(palabra);

            if (contador == null){
                repeticiones.put(palabra,1);
            }else {
                repeticiones.replace(palabra,++contador);
            }
            palabra = escaner.nextLine();
        }
        return String.valueOf(repeticiones);
    }
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println(calcularFrecuencia(escaner));
    }
}
