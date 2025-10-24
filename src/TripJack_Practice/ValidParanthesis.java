package TripJack_Practice;

import java.util.Stack;

public class ValidParanthesis
{
    public static void main(String[] args)
    {
        String str = "(]";
        System.out.println(checkValidParanthesis(str));
    }

    public static boolean checkValidParanthesis(String str)
    {
        Stack<Character> stack = new Stack<>();
        char c;
        char poppedElement;
        for (int i = 0; i < str.length(); i++)
        {
            c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[')
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                poppedElement = stack.pop();
                if ((c == '}' && poppedElement != '{') || (c == ')' && poppedElement != '(') || (c == ']' && poppedElement != '['))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
