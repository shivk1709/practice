package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Okay, Provide me the array values now - ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Thanks, reversing the values");
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        int temp;
        while (left < right)
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed array is " + Arrays.toString(arr));
    }
}
