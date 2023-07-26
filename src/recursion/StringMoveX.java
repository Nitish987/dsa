package recursion;

// program to move all 'x' to the end of the string
public class StringMoveX {
    public static void moveAll(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count += 1;
        } else {
            newStr += currChar;
        }
        moveAll(str, idx + 1, count, newStr);
    }
    public static void main(String[] args) {
        moveAll("xHxExLxLxOx", 0, 0, "");
    }
}

// Time complexity : O(n)
