package soconnor;

public class soconnorLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }

    public static String reverse(String var)
    {
        String reversed = "";
        for(int i = var.length()-1; i >= 0; i--)
        {
            String letter = var.substring(i,i+1);
            reversed = reversed + letter;
        }
        return reversed;
    }

    public static boolean isPalindrome(String var)
    {
        String reversed = "";
        for(int i = var.length()-1; i >= 0; i--)
        {
            String letter = var.substring(i,i+1);
            reversed = reversed + letter;
        }
        return reversed.equals(var);
    }

    public static String palindrome(String var)
    {
        String reversed = "";
        for(int i = var.length()-1; i >= 0; i--)
        {
            String letter = var.substring(i,i+1);
            reversed = reversed + letter;
        }
        if(reversed.equals(var)==true)
        {
            return "true";
        }
        else
        {
            return "false";
        }

    }
}
