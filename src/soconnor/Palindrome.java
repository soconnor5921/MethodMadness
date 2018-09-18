package soconnor;

public class Palindrome
{
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
