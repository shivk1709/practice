package TripJack_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Two_Sum
{
    public static void main(String[] args)
    {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(twoSum(nums, target));

    }

    public static List<Integer> twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            int sub = target - nums[i];
            if (map.containsKey(nums[i]))
            {
                output.add(map.get(nums[i]));
                output.add(i);
                return output;
            }
            map.put(sub, i);
        }
        output.add(-1);
        output.add(-1);
        return output;
    }

}
