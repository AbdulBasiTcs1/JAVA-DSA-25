
import java.util.Scanner;

public class DuplicatesAnywhere {

    // this is the lab task 6

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[10];

            System.out.println("Enter 10 Integers: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false;

            System.out.println("Duplicates in the array are: ");

            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;
                int count = 0;


                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) continue;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                    
                }
                if (count > 1) {
                    System.out.println(arr[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No Duplicates Found");
            }
        }
    }
}
