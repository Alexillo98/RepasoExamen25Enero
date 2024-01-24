import java.util.ArrayList;
import java.util.List;

public class PersonasAntes1970 {
    public static void main(String[] args) {

    ArrayList<Person> personas = new ArrayList<>();

    Person persona = new Person("Maria","Gonzalez",1968);
    personas.add(persona);

    persona = new Person("Juan","Martinez",1998);
    personas.add(persona);

    persona = new Person("Pepe","Garcia",1950);
    personas.add(persona);

    long cuantos = personas.stream()
            .filter(person -> person.getBirthYear() < 1970)
            .count();

        System.out.println(cuantos);
    }
}

