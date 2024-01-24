import java.util.ArrayList;
import java.util.List;

public class ApellidosA {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();

        Person persona = new Person("Lana","Alvarez",1998);
        personas.add(persona);

        persona = new Person("Marco","Polo",1956);
        personas.add(persona);

        persona = new Person("Alex","Musat",1998);
        personas.add(persona);

        long porA = personas.stream()
                .filter(person -> person.getLastName().startsWith("A"))
                .count();

        System.out.println(porA);
    }
}
