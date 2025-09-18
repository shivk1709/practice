package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main(String[] args)
    {
        int target = 6;
        int[] arr = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(target, arr)));
    }

    public static int[] twoSum(int target, int[] arr)
    {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                return new int[]{map.get(arr[i]), i};
            }
            map.put(target - arr[i], i);

        }
        return new int[]{};
    }
}
