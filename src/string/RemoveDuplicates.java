package string;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        int n = str.length();
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(str.charAt(i))) {
                 string.append(str.charAt(i));
            }
            map.put(str.charAt(i), 1);
        }
        return string.toString();
    }

    public static void main(String[] args) {
        String str = "HappyNewYear";
        System.out.println(removeDuplicates(str));
    }
}
