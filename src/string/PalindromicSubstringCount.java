package string;

// String + Dynamic Programming

public class PalindromicSubstringCount {
    public static int CountPS(String S, int N) {
        boolean[][] dp = new boolean[S.length()][S.length()];
        int count = 0;
        for (int g = 0; g < S.length(); g++) {
            for (int i = 0, j = g; j < S.length(); i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    dp[i][j] = S.charAt(i) == S.charAt(j);
                } else {
                    dp[i][j] = S.charAt(i) == S.charAt(j) && dp[i + 1][j - 1];
                }
                if (dp[i][j] && S.substring(i, j + 1).length() >= 2) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String st = "abaab";
        System.out.println(CountPS(st, st.length()));
    }
}
