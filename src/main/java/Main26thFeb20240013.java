import com.github.javafaker.Faker;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main26thFeb20240013 {
    static Faker faker = Faker.instance();

    public static void main(String[] args) {
        var people = IntStream.rangeClosed(1, 30)
                .boxed()
                .map(i -> new Person(faker.name().firstName(), faker.name().lastName()))
                .collect(Collectors.toList());
//        System.out.println(people.stream()
//                .collect(Collectors.groupingBy(person -> person.lastName().length(), Collectors.mapping(person -> person.firstName() + " " + person.lastName(), Collectors.toList()))));
        System.out.println(
                people.stream()
                        .collect(Collectors.partitioningBy(person -> person.lastName().startsWith("A"))).get(true)
        );
    }
}

record Person(String firstName, String lastName){}