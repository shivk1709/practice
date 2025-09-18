package LeetCode;

import java.util.*;

public class FirstLastPostionOfElement
{
    public static void main(String[] args)
    {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 6;
        System.out.println(Arrays.toString(findFirstAndlastPostion(arr, target)));
    }

    public static int[] findFirstAndlastPostion(int[] arr, int element)
    {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == element)
            {
                indexes.add(i);
            }
        }
        if (indexes.isEmpty())
        {
            return new int[]{-1, -1};
        }
        return new int[]{indexes.get(0), indexes.get(indexes.size() - 1)};
    }
}
