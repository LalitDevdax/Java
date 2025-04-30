public class SecondLargestAndSmallest {

    public static int secondlargest(int[] arr) {
        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if ((arr[i] < largest) && (arr[i] > slargest)) {
                slargest = arr[i];
            }
        }

        return slargest;
    }

    public static int secondsmallest(int[] arr) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 6 };
        int Second_Largest = secondlargest(arr);
        int Second_Smallest = secondsmallest(arr);
        System.out.println("The Second Largest Element In Array Is : " + Second_Largest);
        System.out.println("The Second Smallest Element In Array Is : " + Second_Smallest);
    }
}
