//Sullivan O'Connor 9/20/18
package soconnor;

public class soconnorLib
{
    public static void println(String str)
    {
        System.out.println(str);
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

    public static String cutOut (String mainStr, String subStr)
    {
        int index = mainStr.indexOf(subStr);
        String newStr = "";
        if(index == 0)
        {
            newStr = mainStr.substring(index + subStr.length());
            return newStr;
        }
        else
        {
            newStr = (mainStr.substring(0,index) + mainStr.substring(index + subStr.length()));
            return newStr;
        }
    }

    public static int sumUpTo(int num)
    {
        int sum = 0;
        for(int i = 0; i <= num; i++)
        {
            sum += i;
        }
        return sum;
    }


}
