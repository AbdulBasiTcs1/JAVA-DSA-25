import java.util.ArrayList;

public class ArrayListMethod {

    // Lab Task 4 

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");

        System.out.println(fruits.get(0));

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add(1, "Mango"); 

        System.out.println("Fruits: " + fruits);

        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Index of Orange: " + fruits.indexOf("Orange"));
        
        System.out.println("Is empty? " + fruits.isEmpty());

        fruits.set(2, "Grapes"); 
        System.out.println("After set: " + fruits);

        System.out.println("Size: " + fruits.size());

        fruits.remove("Banana");

        System.out.println(fruits.remove(0));

        System.out.println("Break kar lety hein yar ab rat hogayi");
    }

}
