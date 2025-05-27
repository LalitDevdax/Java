import java.util.HashMap;

public class ElementOccuranceMore {

    public static void occur(int[] arr) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int num : arr) {
            set.put(num, set.getOrDefault(num, 0) + 1);
        }
        System.out.print("The elements that occurred more than N/2 are : ");
        int n = arr.length / 2;
        for (int num : set.keySet()) {
            if (set.get(num) > n) {
                System.out.println(num + " occurred " + set.get(num) + " times.");
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 3, 1, 2, 2 };
        occur(nums);
    }
}
