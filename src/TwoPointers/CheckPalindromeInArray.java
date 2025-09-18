package TwoPointers;

import java.util.Scanner;

public class CheckPalindromeInArray
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array ...");
        int size = scanner.nextInt();
        System.out.println("Enter the array elements...");
        int[] inputArray = new int[size];
        for (int i = 0; i < size; i++)
        {
            inputArray[i] = scanner.nextInt();
        }
        System.out.println("isPalindrome ? : " + checkPalindrome(inputArray));
    }

    public static boolean checkPalindrome(int[] arr)
    {
        int start = 0, end = arr.length - 1;
        while (start < end)
        {
            if (arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }

}
