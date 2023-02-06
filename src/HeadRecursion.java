
// Head recursion Example
public class HeadRecursion {
    public static void head(int n) {
        if (n > 0) {
            head(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        head(5);
    }
}

// Time Complexity : O(n)
