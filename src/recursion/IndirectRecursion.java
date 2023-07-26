package recursion;

// Indirect Recursion Example
public class IndirectRecursion {
    public static void a(int n) {
        if (n > 0) {
            System.out.println(n);
            b(n - 1);
        }
    }

    public static void b(int n) {
        if (n > 1) {
            System.out.println(n);
            a(n / 2);
        }
    }

    public static void main(String[] args) {
        a(20);
    }
}
