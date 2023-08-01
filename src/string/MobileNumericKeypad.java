package string;

public class MobileNumericKeypad {
    public static String printSequence(String S) {
        String[] keypad = {"2", "22", "222", "3", "33", "333", "4", "44", "444",
                           "5", "55", "555", "6", "66", "666", "7", "77", "777",
                           "7777", "8", "88", "888", "9", "99", "999", "9999"};
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char k = S.charAt(i);
            if (k == ' ') {
                sequence.append("0");
            } else {
                sequence.append(keypad[k - 65]);
            }
        }
        return sequence.toString();
    }

    public static void main(String[] args) {
        String st = "HELLO WORLD";
        System.out.println(printSequence(st));
    }
}
