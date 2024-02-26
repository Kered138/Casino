import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> dogs = new ArrayList<String>();
        dogs.add("Mike");
        dogs.add("Rocket");
        dogs.add("Skipper");
        dogs.add("Doggie");
        dogs.add("Fido");

        ArrayList<Integer> nums = new ArrayList<Integer>(6);
        nums.add(4);
        nums.add(8);
        nums.add(3567890);

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Perriwinkle");
        colors.add("Burnt Umber");
        colors.add("Yellow Ochre");

        ArrayList<Object> inventory = new ArrayList<Object>();
        inventory.add("Helmet");
        inventory.add(5);

        ArrayList<String> prints = new ArrayList<>(234);
        System.out.print(prints);

        // Can Hold multiple items
        // Can be iterated through

        //Arrays are a static size
        //Arrays are easier to access different elements
    }
}
