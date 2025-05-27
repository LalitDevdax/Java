package Sort;

public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merger[] = new int[ei - si + 1];// length ei-si+1 will give the full length of array of orginial array
        int indx1 = si; // for first half of array
        int indx2 = mid + 1;// for 2nd half of array
        int x = 0;// for merger array which will stre new value in sorted way
        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] < arr[indx2]) {
                merger[x++] = arr[indx1++];
            } else {
                merger[x++] = arr[indx2++];
            }
        }

        while (indx1 <= mid) {
            merger[x++] = arr[indx1++];
        }
        while (indx2 <= ei) {
            merger[x++] = arr[indx2++];
        }

        // paste in original array
        for (int i = 0, j = si; i < merger.length; i++, j++) {
            arr[j] = merger[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        // base case :
        if (si >= ei) {
            return;
        }

        // si=starting index
        // ei=ending index
        int mid = si + (ei - si) / 2; // or (si+ei)/2; the diiference is time and space complexity if starting and
                                      // ending index are very large so it can also go out of integer rangr so we
                                      // donot use (si+ei)/2
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        // conquer calling
        conquer(arr, si, mid, ei);

    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
