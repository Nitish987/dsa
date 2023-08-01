package string;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String arr[], int n){
        String st = "";
        int min = Integer.MAX_VALUE;
        for (String s: arr) {
            if (min > s.length()) {
                st = s;
                min = s.length();
            }
        }
        for (String s: arr) {
            for (int i = 0; i < min; i++) {
                if (s.charAt(i) != st.charAt(i)) {
                    st = s.substring(0, i);
                    min = st.length();
                    break;
                }
            }
        }
        return st.length() != 0 ? st : "-1";
    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr, arr.length));
    }
}
