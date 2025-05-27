package Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class max_leastfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter " + n + " Numbers : ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr.add(num);
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("ArrayList : " + arr);
        System.out.println("HashMap : " + hashMap);

        int maxfreq = Collections.max(hashMap.values());
        int minfreq = Collections.min(hashMap.values());
        List<Integer> highfreq = new ArrayList<>();
        List<Integer> lowfreq = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == maxfreq) {
                highfreq.add(entry.getKey());
            }
            if (entry.getValue() == minfreq) {
                lowfreq.add(entry.getKey());
            }
        }

        System.out.println("Highest Frequency Is Of " + highfreq + " That Occured : " + maxfreq + " Times .");
        System.out.println("Lowest Frequency Is Of " + lowfreq + " That Occured : " + minfreq + " Times .");

        sc.close();
    }
}
