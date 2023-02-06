// Given a number n, count the total number of digits required to write all numbers from 1 to n.
// https://practice.geeksforgeeks.org/problems/total-digits4030/1
public class TotalDigits {
    static long totalDigits(long n){
        if (n < 10) return n;
        int nod = Long.toString(n).length();
        int temp = nod;
        int num = 9 * (int) Math.pow(10, nod - 2);
        int c = 0;
        while(num != 0) {
            nod = nod - 1;
            c = c + (num * nod);
            n = n - num;
            num = num/10;
        }
        return c + (n * temp);
    }

    public static void main(String[] args) {
        System.out.println(totalDigits(450));
    }
}
