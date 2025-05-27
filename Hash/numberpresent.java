package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class numberpresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.print("Enter number to find: ");
            int query = sc.nextInt();
            if (hashMap.containsKey(query)) {
                System.out.println(query + " is present " + hashMap.get(query) + " times.");
            } else {
                System.out.println(query + " is not present in the array.");
            }
        }

        sc.close();
    }
}