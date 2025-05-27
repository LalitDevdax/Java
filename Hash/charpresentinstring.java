package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charpresentinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Word To Count Frequency : ");
        String word = sc.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Characters Frequencies : ");
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();

    }
}
