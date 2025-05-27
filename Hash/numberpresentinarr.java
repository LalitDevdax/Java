package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class numberpresentinarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        System.out.print("Enter Length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Enter Total No Of Queries You Want To Run : ");
        int query = sc.nextInt();
        for (int i = 0; i < query; i++) {
            System.out.print("Enter " + i + " Number To Check Frequency : ");
            int numbercounter = sc.nextInt();
            System.out.println(numbercounter + " is present : " + hashMap.getOrDefault(numbercounter, 0) + " Times .");
        }
        sc.close();

    }
}
