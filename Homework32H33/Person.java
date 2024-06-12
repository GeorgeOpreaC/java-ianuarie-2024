package Homework32H33;
//iven a list of Person objects with age and city attributes,
// filter out people younger than 18 or those who live in the city "Metropolis",
// then return a list of names of the remaining people, sorted in reverse order.
public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
