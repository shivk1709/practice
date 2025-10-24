package TripJack_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum_Set
{
    public static void main(String[] args)
    {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target)
    {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
        {
            int sub = target - num;
            if (set.contains(num))
            {
                return new int[]{sub, num};
            }
            set.add(sub);
        }
        return new int[]{-1, -1};
    }
}
