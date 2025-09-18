package TwoPointers;

import java.util.*;

public class ThreeSum
{
    public static void main(String[] args)
    {
        int[] arr = {0, 0, 0};
        System.out.println(find3Sum(arr));

    }

    public static List<List<Integer>> find3Sum(int[] arr)
    {
        Set<List<Integer>> output = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++)
        {
            int left = i + 1, right = arr.length - 1;
            while (left < right)
            {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0)
                {
                    output.add(List.of(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) left++;
                else right--;
            }
        }
        return new ArrayList<>(output);
    }
}
