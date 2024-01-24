import java.util.ArrayList;

public class DivisiblesTresYPromedio {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(25);
        numeros.add(30);
        numeros.add(20);

        long cuantos = numeros.stream()
                .filter(n -> n%3 ==0)
                .count();

        double media = numeros.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .average()
                .getAsDouble();

        System.out.println(cuantos);
        System.out.println(media);
    }
}
