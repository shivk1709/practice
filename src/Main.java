import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4};
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
        System.out.println(Arrays.toString(arr));
    }

}