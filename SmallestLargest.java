import java.util.*;
public class SmallestLargest{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integer values");
        for (int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<smallest){
                smallest=numbers[i];
            }
            if (numbers[i]>largest){
                largest=numbers[i];
            }
        
        }
        System.out.println("Smallest Value: "+smallest);
        System.out.println("Largest Value: "+largest);
        sc.close();
    }
}