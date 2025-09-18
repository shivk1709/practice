package TwoPointers;

import java.util.*;

public class TargetSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array ...");
        int size = scanner.nextInt();
        System.out.println("Enter the values ...");
        int[] inputArray = new int[size];
        for (int i = 0; i < size; i++)
        {
            inputArray[i] = scanner.nextInt();
        }
        System.out.println("Enter the Target Sum...");
        int target = scanner.nextInt();
        System.out.println(targetSum(inputArray, target));
    }

    public static List<List<Integer>> targetSum(int[] arr, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = arr.length - 1;
        List<List<Integer>> outputList = new ArrayList<>();
        List<Integer> matched = null;
        while (left < right)
        {
            if (arr[left] + arr[right] == target)
            {
                outputList.add(List.of(left, right));
                left ++;
                right --;
            } else if (arr[left] + arr[right] < target) left++;
            else right--;
        }
        return outputList;
    }

}
