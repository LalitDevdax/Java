public class RemoveDupsInSortedArray {

    public static int DuplicatesRemoveBruteForce(int[] arr1) {
        if (arr1.length == 0) {
            return 0;
        }

        int temp[] = new int[arr1.length];
        int j = 0;

        temp[j++] = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] != arr1[i - 1]) {
                temp[j++] = arr1[i];
            }
        }

        for (int i = 0; i < j; i++) {
            arr1[i] = temp[i];
        }

        return j;
    }

    public static int DuplicatesRemoveOptimizeSol(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
        int[] arrCopyForBruteForce = arr.clone();

        int newLength = DuplicatesRemoveOptimizeSol(arr);
        int newLength1 = DuplicatesRemoveBruteForce(arrCopyForBruteForce);

        System.out.println("Array after removing duplicates By Optimized Solution:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Array after removing duplicates by Brute Force :");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
