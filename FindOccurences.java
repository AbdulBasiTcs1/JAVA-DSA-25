
import java.util.Scanner;

public class FindOccurences {

    // last lab task of lab on arrays 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 Integers: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value you wanna search : ");
        int value = sc.nextInt();

        boolean found = false;
        System.out.println("Values found at the indexes : ");
        for (int i=0;i<arr.length;i++){
            if (arr[i]==value){
                System.out.println(i+" ");
                found=true;
            }
        }
        if (!found){
            System.out.println("Not Found");
        } else {
            System.out.println();
        }
        sc.close();
    }
}
