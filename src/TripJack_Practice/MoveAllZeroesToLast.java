package TripJack_Practice;

import java.util.Arrays;

public class MoveAllZeroesToLast
{
    public static void main(String[] args)
    {
        int[] inputArray = {0, 1, 0, 3, 12};
        int zeroIndex = 0;

        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i] != 0)
            {
                inputArray[zeroIndex] = inputArray[i];
                zeroIndex++;
            }
        }

        while (zeroIndex < inputArray.length)
        {
            inputArray[zeroIndex] = 0;
            zeroIndex++;
        }

        System.out.println(Arrays.toString(inputArray));

    }
}
