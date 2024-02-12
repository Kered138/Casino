import java.util.ArrayList;

public class Potion {  
    String name;
    int size;
    int ingredients;
    ArrayList<String> steps;
    /**
     * Hi
     * @param name
     * @param size
     * @param ingredients
     * @param steps
     */
    public Potion(String name, int size, int ingredients, ArrayList<String> steps){
        this.name = name;
        this.size = size;
        this.ingredients = ingredients;
        this.steps = steps;
    }
    

    public String toString(){
       return "Name: " + name + " Size: " + size + " Ingredients: " + ingredients + " Steps: " + steps;
    }
    public ArrayList<String> getSteps(){
        return steps;
    }


}
