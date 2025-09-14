
import java.util.Scanner;

public class DuplicatesAnywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 Integers: ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=sc.nextInt();        
        }
        boolean found=false;
        System.out.println("Duplicates in the array are: ");
        for (int i=0;i<arr.length;i++){
            boolean alreadyChecked = false;
            for (int k=0 ; k<arr.length ; k++){
                if(arr[i]==arr[k]){
                    alreadyChecked=true;
                    break;
                }
            }
            if (alreadyChecked) continue;
            int count = 0;
            for (int j=0 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    found=true;
                }
            }
            if (count>0){
                System.out.println(arr[i]);
                found=true;
            }
        }
        if(!found){
            System.out.println("No Duplicates Found");
        }
        sc.close();
    }
}
