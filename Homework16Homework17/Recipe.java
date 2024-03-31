package Homework16Homework17;
//Tema-16-17😼:
//-Design a recipe book where you can add recipes, and search for recipes based on ingredients.
//class Recipe {
//    private String name;
//    private List<String> ingredients;
//-Adaugati in clasa: constructor, getteri, setteri, metoda addRecipe(),
// metoda public boolean hasIngredient(String ingredient).
//-In clasa Main folositi acest array pentru a apela metoda hasIngredient() de mai sus:
//List<Recipe> recipesWithMilk = new ArrayList<>();

import java.util.ArrayList;
import java.util.List;

class Recipe {

    private String name;
    private ArrayList<String> ingredients= new ArrayList<>();
    ArrayList<Recipe> recipes= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe(String name, ArrayList<String> ingredients) {
        this.name = name;
        this.ingredients= ingredients;

    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }
    public Recipe search(){
        for (int i = 0; i<recipes.size(); i++){
            if (recipes.get(i).getName().equals(name)){
                recipes.get(i);
            }
        }
        return null;
    }

    public boolean hasIngredients(String ingredient){
        return ingredients.contains(ingredient);
    }
}








