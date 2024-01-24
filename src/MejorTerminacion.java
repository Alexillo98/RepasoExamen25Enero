import java.util.HashMap;
import java.util.Map;

public class MejorTerminacion
{
    public static Map<String,Integer> terminacion (String[] boletos)
    {
        Map<String,Integer> terminaciones = new HashMap<>();
        String terminacion;

        for (int i = 0; i < boletos.length ; i++){
            terminacion = String.valueOf(boletos[i].charAt(4));
            Integer contador = terminaciones.get(terminacion);

            if (contador == null){
                terminaciones.put(terminacion,1);
            }else {
                terminaciones.put(terminacion,++contador);
            }
        }
        return terminaciones;
    }
    public static void main(String[] args) {
        String[] boletos = {"00004","03847","39804","39804","39804"};

        System.out.println(terminacion(boletos));
    }
}
