package Homework26H27;
//-Create a generic class Box<T> that can store a single item of any type.
// Implement methods to set and get the item from the box.
//-Design a Movie class with attributes like title, genre, and a list of ratings.
// Create a method that retrieve the average rating for any movie.
public class Box<T> {
    private T item;

    //Metoda pt a seta elementul in cutie.

    public void setItem(T item) {
        this.item = item;
    }
    //Metoda pt a obtine elementul din cutie.
    public T getItem() {
        return item;
    }
}
