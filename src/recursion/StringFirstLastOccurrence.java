package recursion;

// program to find the 1st and last occurrence of an element in string
public class StringFirstLastOccurrence {
    public static int first = -1;
    public static int last = -1;

    public static void occurrence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("first : " + first);
            System.out.println("last : " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        occurrence(str, idx + 1, element);
    } 

    public static void main(String[] args) {
        occurrence("abaacdaefaah", 0, 'a');
    }
}

// Time Complexity : O(n)