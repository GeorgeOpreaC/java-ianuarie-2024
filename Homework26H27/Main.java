package Homework26H27;

public class Main {
    public static void main(String[] args) {
        //Cream o cutie care poate stoca orice tip de obiect
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        int intValue = integerBox.getItem();// Obtine valoarea din cutie
        System.out.println("Integer value: " + intValue);

        Box<String> stringBox = new Box<>();
        stringBox.setItem("A");
        String setValue = stringBox.getItem();
        System.out.println("String value: " + setValue);

        //Cream un obiect si adaugam cateva evaluari
        Movie movie = new Movie("Drama","Horror");
        movie.addRating(8.5);
        movie.addRating(9.0);
        movie.addRating(7.5);

        //Afisam media evaluarilor pentru film
        System.out.println("Average rating for" + movie.getTitle()+ ": " + movie.getAverageRating());
    }
}
