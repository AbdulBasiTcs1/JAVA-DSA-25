public class Copy {
    
    // Copy content from one arr to other
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int arr2[] = {3,5,7,8,2};
        arr=arr2;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }    
    }
}
