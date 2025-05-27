public class MoveAllZeroToEnd {

    public static void movingZeros(int[] arr) {
        int nonZeroIndex = 0; // Pointer to track non-zero placement

        // Shift non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 4, 5, 0, 6, 0, 0, 7 };
        movingZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
