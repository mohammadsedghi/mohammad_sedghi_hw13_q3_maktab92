import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPerson();
//        people.stream().sorted(Comparator.comparing(Person::getAge)).
//                collect(Collectors.toList()).forEach(System.out::println);




    }

    public static List<Person> getPerson() {
        return List.of(new Person("ali", "sedghi", 25,
                        new Address("semnan", 1, "azadi", "3594734473")),
                new Person("reza", "sadghiFard", 22,
                        new Address("tehran", 5, "moallem", "3514747532")),
                new Person("saman", "samani", 18,
                        new Address("shiraz", 2, "kamali", "3598765432")),
                new Person("amirAli", "rezaee", 15,
                        new Address("tehran", 22, "navab", "3514747532"))

        );
    }
}