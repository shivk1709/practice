package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics
{
    public static void main(String[] args)
    {
        Integer[] array = {10, 20, 5, 9, 21, 70, 69};
        List<Integer> convertArrayToList = new ArrayList<>(Arrays.asList(array));
        convertArrayToList.add(29);
        convertArrayToList.remove(Integer.valueOf(1000));
        System.out.println(convertArrayToList);

    }
}
