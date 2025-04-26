package Module2;
import java.util.*;

public class PrimeNumber{
    private static boolean isPrimeNumber(int num) {
        if (num < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0) return false;
        }

        return true;
    }

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        while (count < 5) {
            if (isPrimeNumber(n)) {
                primes.add(n);
                count++;
            }
            n++;
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(generatePrimes(n));  
    }
}
