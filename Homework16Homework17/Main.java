package Homework16Homework17;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Recipe>recipesWithMilk = new ArrayList<>();

        ArrayList<String> ingredientsforpancakes= new ArrayList<>();
        ingredientsforpancakes.add("Eggs");
        ingredientsforpancakes.add("Milk");
        ingredientsforpancakes.add("Sugar");
        Recipe pancakesRecipe = new Recipe("Pancakes", ingredientsforpancakes);

        recipesWithMilk.add(pancakesRecipe);

        for (Recipe recipe: recipesWithMilk){
            if (recipe.hasIngredients("Milk")){
                System.out.println("Recipe found with milk: "+recipe.getName());


            }
        }
    }
}