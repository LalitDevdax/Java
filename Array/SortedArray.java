public class SortedArray {

    public static boolean Arraysort(int[] arr) {

        // optimized solution --
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5 };
        boolean sorted = Arraysort(arr);
        if (sorted == true) {
            System.out.println("Array Is Sorted !");
        } else {
            System.out.println("Array Is Not Sorted !");
        }
    }
}
