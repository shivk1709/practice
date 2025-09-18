package TwoPointers;

public class isPalindromeString
{
    public static void main(String[] args)
    {
        String str = "Was it a car or a cat I saw?";
        System.out.println(isPalindromeString(str));
    }

    public static boolean isPalindromeString(String str)
    {
        str = str.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
