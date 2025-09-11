import java.util.Scanner;

public class PassArrayInMethod {

// A program to pass Array to Methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printArray(new int[] {1,2,3,4,5,6,7});
        printArray(new int[] {3,4,5,6,7,8,8});

    }
    public static int printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        } 
        return 0;
    }
}