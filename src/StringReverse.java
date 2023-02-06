// program to print reverse of a string
// https://practice.geeksforgeeks.org/problems/reverse-a-string/1?page=1&status[]=solved&sortBy=submissions
public class StringReverse {
    public static void reverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str,  idx - 1);
    }
    public static void main(String[] args) {
        String str = "HELLO";
        reverse(str, str.length() - 1);
    }
}

// Time Complexity : O(n)

