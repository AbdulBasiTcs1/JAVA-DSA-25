public class ArrayDeletion {
    public static void main(String[] args) {
        double[] array = new double[8];
        array[0]=1.2;
        array[1]=2.2;
        array[3]=1.4;
        array[4]=2.1;
        int k=3;
        if (k>=array.length) {
            System.out.println("The position should be less than the size of an array");
        }
        int j=k;
        while (j<array.length-1) {
            array[j]=array[j+1];
            j++;
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
