public class ArraySearching {
    public static void main(String[] args) {
        double[] array = new double[8];
        double val = 3.5;
        int pos=0;
        boolean found=false;
        for (int i=0;i<array.length;i++){
            if (array[i]==val) {
                found=true;
                pos=i;
                break;
            }
            if(found){
                System.out.println(val+", found at position "+pos);
            }else{
                System.out.println(val+" not found ");
            }
        }
    }
}
