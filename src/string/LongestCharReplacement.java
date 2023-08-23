package string;

import java.util.HashMap;
import java.util.Map;

public class LongestCharReplacement {
    static int characterReplacement(String S, int K) {
        Map<Character, Integer> count = new HashMap<>();
        int l = 0, max = 0, result = 0;
        for (int r = 0; r < S.length(); r++) {
            char ch = S.charAt(r);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            max = Math.max(max, count.get(ch));
            while(((r - l + 1) - max) > K) {
                ch = S.charAt(l);
                count.put(ch, count.get(ch) - 1);
                l += 1;
            }
            result = Math.max(result, (r - l + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "ABBABA";
        System.out.println(characterReplacement(s, 2));
    }
}
