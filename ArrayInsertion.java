public class ArrayInsertion {

    // A program to insert an element in an array at a specified location :

    public static void main(String[] args) {
        double array[] = new double[8];
        array[0]=1.9;
        array[1]=2.3;
        array[2]=1.2;
        array[3]=5.3;
        int k=0;
        double value = 1.9;
        if (k>=array.length) {
            System.out.println("The position should be less than the size of an array!");
            return;
        }
        int j=array.length-2;
        while (j>=k) {
            array[j+1]=array[j];
            j--;
        }
        array[k]=value;
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
