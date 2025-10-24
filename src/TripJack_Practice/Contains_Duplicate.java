package TripJack_Practice;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate
{
    public static void main(String[] args)
    {
        int[] nums = {3, 5, 1};
        System.out.println(checkContainsDuplicate(nums));
    }

    private static boolean checkContainsDuplicate(int[] nums)
    {
        Set<Integer> checkDuplicateSet = new HashSet<>();
        for (int num : nums)
        {
            if (checkDuplicateSet.contains(num))
            {
                return true;
            }
            checkDuplicateSet.add(num);
        }
        return false;
    }
}
