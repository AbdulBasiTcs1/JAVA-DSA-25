import java.util.ArrayList;

public class PrimeNumbers {

    // Lab Task 2 

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int num=100;num<=500;num++){
            if ((isPrime(num))) {
                primes.add(num);
            }
        }
        System.out.println("Prime Numbers From 100 to 500 are: ");
        System.out.println(primes);
    }

    public static boolean isPrime(int n){
        
        if (n<2) return false;
        for (int i=2;i<=n/2;i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
