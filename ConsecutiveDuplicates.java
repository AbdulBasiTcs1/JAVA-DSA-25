import java.util.*;
public class ConsecutiveDuplicates{

    // Lab Task 5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 Integers: ");

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        
        for (int i=0; i<arr.length ; i++){
            if (arr[i]==arr[i+1]){
                System.out.println("Consecutive Duplicates found at positions: "+i+" and "+(i+1)+" and their value: "+arr[i]);
                found=true;
            }        
        }
        if(!found){
            System.out.println("No consecutive duplicates found.");
        }
        sc.close();
    }

}