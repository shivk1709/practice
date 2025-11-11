package TripJack_Practice;

import java.util.HashMap;
import java.util.Map;

public class NumberWithHigherFrequency
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 2, 3, 4, 1, 3, 2, 2};

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency
        for (int num : arr)
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find number with highest frequency
        int maxFreq = 0;
        int mostFrequent = arr[0];

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet())
        {
            if (entry.getValue() > maxFreq)
            {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Number with highest frequency: " + mostFrequent);
        System.out.println("Frequency: " + maxFreq);
    }
}
