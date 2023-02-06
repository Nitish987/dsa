// Sum of first n natural number using recursion
public class SumOfFirstNaturalNum {
    public static void sum(int n, int s) {
        if (n < 0) {
            System.out.println(s);
            return;
        }
        sum(n - 1, s + n);
    }

    public static void main(String[] args) {
        sum(10, 0);
    }
}

// Time Complexity : O(n)
// Note : Use the formula = [n(n + 1) / 2] directly for calculating sum of first n natural.