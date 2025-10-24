package LeetCode.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSumSet
{
    public static void main(String[] args)
    {
        int[] numbers = {2, 3, 4};
        int target = 6;
        System.out.println(Arrays.toString(targetSum(numbers, target)));
    }

    public static int[] targetSum(int[] numbers, int target)
    {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++)
        {
            if(set.contains(numbers[i]))
            {
                return new int[] {numbers[i], target - numbers[i]};
            }
            set.add(target - numbers[i]);
        }
        return new int[]{-1, -1};
    }

}
