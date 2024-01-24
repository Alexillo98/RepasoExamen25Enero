import java.util.ArrayList;
import java.util.List;

public class NombresUnicos {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();

        Person persona = new Person("Marco","Alvarez",1998);
        personas.add(persona);

        persona = new Person("Marco","Polo",1956);
        personas.add(persona);

        persona = new Person("Alex","Musat",1998);
        personas.add(persona);

        String nombre = personas.stream()
                .map(Person)
    }
}
