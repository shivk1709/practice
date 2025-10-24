package TripJack_Practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepChar_Number
{
    public static void main(String[] args)
    {
        int left = 0;
        String s = "bbbbb";
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++)
        {
            while (set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}
