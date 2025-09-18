package LeetCode.practice;

public class MergeAlternatively {

    public static void main(String[] args) {
        System.out.println(merge("abcd", "pq"));
    }

    private static String merge(String word1, String word2)
    {
        StringBuilder result = new StringBuilder();
        int maxLen;
        maxLen = Math.max(word1.length(), word2.length());
        for(int i = 0; i < maxLen; i++)
        {
            if(i >= word1.length())
            {
                return result.append(word2, i, word2.length()).toString();
            }
            else if(i >= word2.length())
            {
                return result.append(word1, i, word1.length()).toString();
            }
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return result.toString();
    }
}
