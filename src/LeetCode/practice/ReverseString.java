package LeetCode.practice;

import java.sql.SQLOutput;

public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "abcd";
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;
        char temp;
        while (left < right)
        {
            temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            right--;
            left++;
        }
        System.out.println(new String(charArray));
        return;
    }
}
