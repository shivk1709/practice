package TripJack_Practice;

public class LongestRepeatingCharReplacement
{
    public int characterReplacement(String s, int k)
    {
        int[] count = new int[26];
        int maxCount = 0, left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++)
        {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while (right - left + 1 - maxCount > k)
            {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args)
    {
        LongestRepeatingCharReplacement lr = new LongestRepeatingCharReplacement();
        String s = "AABABBA";
        int k = 1;
        System.out.println(lr.characterReplacement(s, k)); // Output: 4
    }
}
