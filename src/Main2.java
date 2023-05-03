import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = getPerson();
        List<Person>personList=people.stream().sorted(Comparator.comparing(Person::getAge)).
                collect(Collectors.toList());
        personList.forEach(System.out::println);
        System.out.println("=====================================================");
        List<Person>personList1=people.stream().sorted(Comparator.comparing(Person -> Person.getAddress().getPostalCode()))
                .collect(Collectors.toList());
        personList1.forEach(System.out::println);
        System.out.println("=====================================================");
        List<Person>personList2= people.stream().sorted(Comparator.comparing(Person -> Person.getLastName().length())).
                collect(Collectors.toList());
        personList2.forEach(System.out::println);
        System.out.println("=====================================================");
        List<Person> personList3= people.stream().filter(
                Person -> Person.getAddress().getCity() == "tehran" && Person.getAddress().getZone() == 5).collect(Collectors.toList());

        personList3.forEach(System.out::println);
    }

    public static List<Person> getPerson() {
        return List.of(new Person("ali", "sedghi", 25,
                        new Address("semnan", 1, "azadi", "3594734473")),
                new Person("reza", "sadghiFard", 22,
                        new Address("tehran", 5, "moallem", "3514747532")),
                new Person("saman", "samaniaaaa", 18,
                        new Address("shiraz", 2, "kamali", "3598765432")),
                new Person("amirAli", "rezaee", 15,
                        new Address("tehran", 22, "navab", "3514747532"))

        );
    }
}
