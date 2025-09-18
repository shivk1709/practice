package LeetCode;

public class LongestCommonPrefix
{
    public static String commonPrefix(String[] array)
    {
        String prefix = array[0];
        for (int i = 1; i < array.length; i++)
        {
            while (array[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args)
    {
        String[] array = {"flower", "flow", "flight"};
        System.out.println(commonPrefix(array));
    }
}
