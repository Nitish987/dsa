import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

// Union of two Arrays
// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

public class Union {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        Set<Integer> union = new HashSet<>();
        for (int ele: arr1) {
            union.add(ele);
        }
        for (int ele: arr2) {
            union.add(ele);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(union);
        arrayList.sort(Comparator.comparingInt(a -> a));
        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 35};
        int[] arr2 = {6, 9, 13, 15, 20, 25, 29, 46};
        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));
    }
}
