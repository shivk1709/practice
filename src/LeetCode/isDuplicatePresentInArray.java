package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class isDuplicatePresentInArray
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 1};
        System.out.println(checkDuplicate(nums));

    }

    public static boolean checkDuplicate(int[] nums)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
