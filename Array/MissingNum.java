public class MissingNum {
    public static void missingnum(int[] arr, int N) {
        // int max = 0;
        // for (int num : arr) {
        // max = Math.max(max, num);
        // }

        // boolean[] present = new boolean[max + 1];
        // for (int num : arr) {
        // present[num] = true;
        // }

        // System.out.println("Missing Numbers : ");
        // for (int i = 1; i <= max; i++) {
        // if (!present[i]) {
        // System.out.print(i + " ");
        // }
        // }

        // optimal sol O(N) sc = O(1) using XOR but this is just for 1 missing number ,
        // and above is for many missing numbers
        int xor1 = 0, xor2 = 0;
        int n = N - 1;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ N;

        System.out.println("Missing Number : " + (xor1 ^ xor2));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int N = arr.length;

        missingnum(arr, N);
    }
}
