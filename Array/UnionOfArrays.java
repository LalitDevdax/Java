import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {

    public static int[] unionTwoPointers(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;
        int[] union = new int[n + m]; // Maximum possible size
        int index = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (index == 0 || union[index - 1] != arr1[i]) {
                    union[index++] = arr1[i]; // Store unique value
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (index == 0 || union[index - 1] != arr2[j]) {
                    union[index++] = arr2[j];
                }
                j++;
            } else { // arr1[i] == arr2[j]
                if (index == 0 || union[index - 1] != arr1[i]) {
                    union[index++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (union[index - 1] != arr1[i]) {
                union[index++] = arr1[i];
            }
            i++;
        }

        while (j < m) {
            if (union[index - 1] != arr2[j]) {
                union[index++] = arr2[j];
            }
            j++;
        }

        return Arrays.copyOf(union, index); // Trim unused space
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6 };

        int[] result = unionTwoPointers(arr1, arr2);

        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 5, 6]
    }

    // Brute Soln - TC = O(n1logn) + O(n2logn) + O(n1+n2)
    // int[] arr1 = { 1, 1, 2, 3, 4, 5 };
    // int[] arr2 = { 2, 3, 4, 4, 5, 6 };
    // Set<Integer> st = new HashSet<>();

    // for (int i = 0; i < arr1.length; i++) {
    // st.add(arr1[i]);
    // }
    // for (int i = 0; i < arr2.length; i++) {
    // st.add(arr2[i]);
    // }
    // int[] union = new int[st.size()];
    // int i = 0;
    // for (int it : st) {
    // union[i++] = it;
    // }

    // // Print union array
    // for (int num : union) {
    // System.out.print(num + " ");
}