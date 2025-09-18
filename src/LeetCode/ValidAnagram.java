package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram
{
    public static void main(String[] args)
    {
        System.out.println(checkAnagram("rat", "car"));
    }

    public static boolean checkAnagram(String str1, String str2)
    {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Map<Character, Integer> occurrence = new HashMap<>();
        for (char c : charArray1)
        {
            occurrence.put(c, occurrence.getOrDefault(c, 0) + 1);
        }

        for (char ch : charArray2)
        {
            if (!occurrence.containsKey(ch)) return false;
            occurrence.put(ch, occurrence.get(ch) - 1);
            if (occurrence.get(ch) == 0) occurrence.remove(ch);
        }

        return occurrence.isEmpty();
    }
}
