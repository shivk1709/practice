package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatePresentPositions
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 1, 3, 2, 6, 3, 8, 1, 6, 8, 0, 2, 3, 4, 3, 2, 4};
        System.out.println(findDuplicatesPositions(nums));
    }

    public static Map<Integer, List<Integer>> findDuplicatesPositions(int[] nums)
    {
        Map<Integer, List<Integer>> output = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            output.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i + 1);
        }
        return output;
    }
}
