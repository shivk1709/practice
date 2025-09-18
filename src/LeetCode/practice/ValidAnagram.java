package LeetCode.practice;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "car";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!map.containsKey(s2.charAt(i))) {
                System.out.println("Not Anagram");
                return;
            }
            map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
            if (map.get(s2.charAt(i)) == 0) {
                map.remove(s2.charAt(i));
            }
        }
        System.out.println("Anagram");
    }
}
