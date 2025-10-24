package TripJack_Practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_String
{
    public String longestSubstringWithoutRepeating(String s)
    {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0, start = 0;
        String result = "";
        for (int right = 0; right < s.length(); right++)
        {
            while (set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if (right - left + 1 > maxLen)
            {
                maxLen = right - left + 1;
                start = left;
                result = s.substring(start, start + maxLen);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        LongestSubstring_String ls = new LongestSubstring_String();
        String s = "abcabcbb";
        System.out.println(ls.longestSubstringWithoutRepeating(s));
    }
}
