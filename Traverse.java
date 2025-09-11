import java.util.Scanner;
// A java program to traverse (Go Through) - in arrays by each element
public class Traverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write elements in array: ");
        int arr[] = new int[10];
        for (int i=0;i<arr.length;i++){
            System.out.println("Elemnt "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}