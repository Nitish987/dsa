// Tree Recursion Example
public class TreeRecursion {
    public static void tree(int n) {
        if (n > 0) {
            System.out.println(n);
            tree(n - 1);
            tree(n - 1);
        }
    }

    public static void main(String[] args) {
        tree(3);
    }
}

// Time complexity : O(2^n)