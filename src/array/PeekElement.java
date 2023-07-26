package array;

public class PeekElement {
    public int peak(int[] arr, int n, int l, int h) {
        int m = l + (h - l) / 2;
        if ((m == 0 || arr[m - 1] <= arr[m]) && (m == n - 1 || arr[m + 1] <= arr[m])) {
            return m;
        } else if (m > 0 && arr[m - 1] > arr[m]) {
            return  peak(arr, n, l, m - 1);
        } else {
            return peak(arr, n,m + 1, h);
        }
    }
    public int peakElement(int[] arr, int n) {
        if (n == 1) {
            return  0;
        }

        if (n == 2) {
            if (arr[0] > arr[1]) {
                return 0;
            }
            return 1;
        }

        return peak(arr, n, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2};
        PeekElement peak = new PeekElement();
        System.out.println(arr[peak.peakElement(arr, arr.length)]);
    }
}
