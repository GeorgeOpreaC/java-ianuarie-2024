package Homework32H33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice",25,"Gotham"));
        people.add(new Person("Andrew",17,"Metropolis"));
        people.add(new Person("Charlie",30,"Smallville"));
        people.add(new Person("Dave",19,"Metropolis"));
        people.add(new Person("Eve",20,"Gotham"));

        List<String> result = people.stream()
                .filter(person -> person.getAge() >=18)
                .filter(person -> !person.getCity().equals("Metropolis"))
                .map(Person::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
