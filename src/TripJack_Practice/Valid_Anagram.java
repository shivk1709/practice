package TripJack_Practice;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram
{
    public static void main(String[] args)
    {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(checkValidAnagram(s, t));
    }

    public static boolean checkValidAnagram(String s, String t)
    {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Map<Character, Integer> occurences = new HashMap<>();
        for (char ch1 : sArray)
        {
            occurences.put(ch1, occurences.getOrDefault(ch1, 0) + 1);
        }
        for (char ch2 : tArray)
        {
            if (!occurences.containsKey(ch2)) return false;
            occurences.put(ch2, occurences.get(ch2) - 1);
            if (occurences.get(ch2) == 0) occurences.remove(ch2);
        }
        return occurences.isEmpty();
    }

}
