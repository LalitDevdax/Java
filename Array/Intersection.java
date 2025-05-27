import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static List<Integer> findintersection(int[] arr1, int[] arr2) {
        List<Integer> intersectedarray = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                intersectedarray.add(arr1[i]);
                i++;
                j++;
            }
        }

        return intersectedarray;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 5, 7 };
        int[] arr2 = { 2, 5, 5, 7, 8 };

        System.out.println("Intersection: " + findintersection(arr1, arr2));

    }
}