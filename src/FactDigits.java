// https://practice.geeksforgeeks.org/problems/count-digits-in-a-factorial3957/1
public class FactDigits {
    static int facDigits(int N){
        if (N < 0)
            return 0;
        if (N <= 1)
            return 1;
        double c = 0;
        for (int i = 2; i <= N; i++) {
            c += Math.log10(i);
        }
        return (int)(Math.floor(c)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(facDigits(19));
    }
}