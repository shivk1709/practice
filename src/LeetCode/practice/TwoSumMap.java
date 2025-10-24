package LeetCode.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMap
{
    public static void main(String[] args)
    {
        int[] numbers = {2, 3, 4};
        int target = 6;
    }


    public static int[] twoSum(int[] numbers, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++)
        {
            if (map.containsKey(numbers[i]))
            {
                return new int[]{map.get(numbers[i]), i};
            }
            map.put(target - numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}
