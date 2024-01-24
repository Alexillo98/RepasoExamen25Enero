import java.util.HashMap;
import java.util.Map;

public class Botin
{
    public static Map<Integer, String> reparto (int[] billetes, int participantes){

        Map<Integer,String> reparto = new HashMap<>();

        int contador = 0;

        for (int i = 0; i < billetes.length ; i++){

            String botin = reparto.get(contador);

            if(botin == null)
            {
                reparto.put(contador, billetes[i] + " ");
            }else
            {
                reparto.put(contador,botin + " " + billetes[i]);
            }

            contador++;

            if (contador == participantes)
            {
                contador = 0;
            }
        }
        return reparto;
    }
    public static void main(String[] args) {
        int[] billetes = {10,20,50,200,500};
        int participantes = 2;

        System.out.println(reparto(billetes,participantes));
    }
}
