import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int limit = sc.nextInt();

        ArrayList<Integer> fibIntegers = new ArrayList<>();

        int a=0,b=1;

        fibIntegers.add(a);
        fibIntegers.add(b);
        
        while (true) {
            int next = a+b;
            if (next>limit) {
                break;
            }
            fibIntegers.add(next);
            a=b;
            b=next;
        }
        System.out.println("Fibonacci Series Upto "+limit+"are :"+fibIntegers);
        sc.close();
    }
}
