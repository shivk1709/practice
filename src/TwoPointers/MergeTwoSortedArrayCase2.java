package TwoPointers;

import java.util.Arrays;

public class MergeTwoSortedArrayCase2
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int m = 3, n = 3;
        int j = 0;
        for (int i = m; i < arr1.length; i++)
        {
            arr1[i] = arr2[j++];
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
