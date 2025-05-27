package Sort;

public class insertionsort {
    public static void printArray(int[] arr) {
        System.out.println("Sorted Array Is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
        printArray(arr);
    }
}
