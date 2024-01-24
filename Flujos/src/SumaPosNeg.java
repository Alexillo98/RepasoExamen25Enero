import java.util.ArrayList;

public class SumaPosNeg {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(-1);
        numeros.add(3);
        numeros.add(-2);

        long positivos = numeros.stream()
                .filter(positivo-> positivo >=0)
                .count();

        long negativos = numeros.stream()
                .filter(negativo-> negativo < 0)
                .count();

        long sumaPositivos = numeros.stream()
                .mapToInt(numero -> Integer.valueOf(numero))
                .filter(n -> n >= 0)
                .sum();

        long sumaNegativos = numeros.stream()
                        .mapToInt(valor -> Integer.valueOf(valor))
                                .filter(n -> n < 0)
                                        .sum();
        System.out.println(positivos);
        System.out.println(negativos);
        System.out.println(sumaPositivos);
        System.out.println(sumaNegativos);
    }
}
