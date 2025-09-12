import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");

        System.out.println(fruits.get(0));

        fruits.remove("Banana");

        System.out.println(fruits.remove(0));

        System.out.println("Break kar lety hein yar ab rat hogayi");
    }
}
