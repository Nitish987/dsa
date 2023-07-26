import java.util.ArrayList;

public class StockBuySell {
    static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        int i = 0;
        while(i < n - 1) {
            while (i < n - 1 && A[i] >= A[i + 1]) {
                i++;
            }

            if (i == n - 1) {
                return pairs;
            }

            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(i);
            i++;
            while (i < n && A[i] >= A[i - 1]) {
                i++;
            }
            pair.add(i - 1);
            pairs.add(pair);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] A = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(stockBuySell(A, A.length));
    }
}
