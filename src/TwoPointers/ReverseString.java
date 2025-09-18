package TwoPointers;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String...");
        String input = scanner.nextLine();
        System.out.println("Reversing the String...");
        System.out.println(reverseString(input));
    }

    private static String reverseString(String str)
    {
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;
        char ch;
        while (left < right)
        {
            ch = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = ch;

            left++;
            right--;
        }
        return new String(charArray);
    }
}
