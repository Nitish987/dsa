import java.util.ArrayList;

// Prime Numbers in range
// https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1
public class PrimeRange {
    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    static ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i))
                numbers.add(i);
        }
        return numbers;
    }
    public static void main(String[] args) {
        System.out.println(primeRange(1, 25));
    }
}
