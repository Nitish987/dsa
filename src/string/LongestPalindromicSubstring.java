package string;

// String + Dynamic Programming

public class LongestPalindromicSubstring {
    static String longestPalindrome(String S){
        boolean[][] dp = new boolean[S.length()][S.length()];
        int max = 0;
        String sub = "";
        for (int g = 0; g < S.length(); g++) {
            for (int i = 0, j = g; j < S.length(); i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    dp[i][j] = S.charAt(i) == S.charAt(j);
                } else {
                    dp[i][j] = S.charAt(i) == S.charAt(j) && dp[i + 1][j - 1];
                }
                if (dp[i][j] && max < S.substring(i, j + 1).length()) {
                    max = S.substring(i, j + 1).length();
                    sub = S.substring(i, j + 1);
                }
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaabbaaaa"));
    }
}
