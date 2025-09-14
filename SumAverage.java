// public class SumAverage {
//     // to find the sum and average of elements in an array
//     public static void main(String[] args) {

//         int[] arr = {3,2,5,6,7};
//         int sum =0;
//         for (int x : arr){
//             sum=sum+x;
//         }
//         System.out.println("Sum : "+sum);
//         int average = sum/arr.length;
//         System.out.println("Average : "+average);
//     }
// }
public class SumAverage{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;
        for (int x : arr){
            sum+=x;
        }
        System.out.println("Sum: "+sum);
        int average = sum/arr.length;
        System.out.println("Average: "+average);
    }
}