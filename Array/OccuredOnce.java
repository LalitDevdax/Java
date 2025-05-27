import java.util.Collections;
import java.util.HashMap;

public class OccuredOnce {
    public static void occur(int[] arr) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int num : arr) {
            set.put(num, set.getOrDefault(num, 0) + 1);
        }
        System.out.print("The elements that occurred once: ");
        for (int num : set.keySet()) {
            if (set.get(num) == 1) {
                System.out.print(num + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4 };
        occur(nums);
    }
}
