package LeetCode;

import java.util.*;

public class GroupAnagram
{
    public static void main(String[] args)
    {
        System.out.println(groupAnagram(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagram(String[] arr)
    {
        Map<String, List<String>> stringListMap = new HashMap<>();
        for (String str : arr)
        {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            stringListMap.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(stringListMap.values());
    }
}
