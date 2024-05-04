package Homework26H27;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private List<Double> ratings;
    
    //Constructor
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.ratings = new ArrayList<>();
    }
    //Metoda pentru a adauga o evaluare la film
    public void addRating(double rating) {
        ratings.add(rating);
    }
    //Metoda pentru a calcula si returna media evaluarilor pentru film
    public double getAverageRating() {
        if (ratings.isEmpty()){
            return 0.0;
        }else{
            double sum = 0.0;
            for (double rating : ratings) {
                sum += rating;
            }
            return sum/ratings.size();
        }
    }
    //Metoda pt a obtine titlul.
    public String getTitle() {
        return title;
    }
    //Metoda pt genul filmului
    public void setTitle(String title) {
        this.title = title;
    }
    }

