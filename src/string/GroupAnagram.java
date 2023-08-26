package string;

import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnagram {
    static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] f1 = new int[256];
        int[] f2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            f1[s1.charAt(i)]++;
            f2[s2.charAt(i)]++;
        }

        for (int i = 0; i < f1.length; i++) {
            if (f1[i] != f2[i]) {
                return false;
            }
        }

        return true;
    }

    static public List<List<String>> Anagrams(String[] string_list) {
        List<List<String>> groups = new ArrayList<>();
        Boolean[] counted = new Boolean[string_list.length];
        Arrays.fill(counted, false);
        for (int i = 0; i < string_list.length; i++) {
            if (!counted[i]) {
                List<String> group = new ArrayList<>();
                group.add(string_list[i]);
                for (int j = i + 1; j < string_list.length; j++) {
                    if (areAnagram(string_list[i], string_list[j])) {
                        group.add(string_list[j]);
                        counted[j] = true;
                    }
                }
                groups.add(group);
            }
        }
        Collections.reverse(groups);
        return groups;
    }

    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        System.out.println(Anagrams(arr));
    }
}
