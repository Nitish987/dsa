package mathematical;

public class BinaryToDecimal {
    public static void b2d(int n) {
        StringBuilder binary = new StringBuilder();
        while(n != 0) {
            int r = n % 2;
            binary.insert(0, r);
            n = n / 2;
        }
        System.out.println(binary);
        countOnes(binary.toString());
    }

    public static void countOnes(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            char k = binary.charAt(i);
            if (k == '1') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 134;
        b2d(n);
    }
}
