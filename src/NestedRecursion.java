// Nested Recursion Example

public class NestedRecursion {
    public static int function(int n) {
        if (n > 100) return n - 10;
        return function(function(n + 11));
    }

    public static void main(String[] args) {
        int r = function(95);
        System.out.println(r);
    }
}
