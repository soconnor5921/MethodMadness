//Sullivan O'Connor 9/20/18
package soconnor;

public class soconnorLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }

    //isPalindrome
    //param - String var
    //returns - true if var is a palindrome
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

    //cutOut
    //param - String mainStr, String subStr
    //returns - mainStr with first instance of subStr removed
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

    //sumUpTo
    //param - int num
    //returns - the sum of all integers from 0 to num
    public static int sumUpTo(int num)
    {
        int sum = 0;
        for(int i = 0; i <= num; i++)
        {
            sum += i;
        }
        return sum;
    }

    //multiplicationTable
    //param - int base, int range
    //returns - a list of all numbers from 0-range multiplied by base
    public static void multiplicationTable(int base, int range)
    {
        String answer = "";
        for(int i = 0; i <= range; i++)
        {
            String multiplied = String.valueOf(base*i);
            answer = answer + multiplied + ", ";
        }
        System.out.println(answer);

    }

    //fooBarBaz
    //param - int num1
    //returns - a list of numbers from 0-num1 with multiples of 3 replaced with "foo", multiples of 5 replaced with "bar" and multiples of 3 and 5 replaced with "baz"
    public static void fooBarBaz(int num1)
    {
        String answer = "";
        for(int i = 1; i <= num1; i++)
        {
            String num = "";
            if(i % 3 == 0 && i % 5 == 0)
            {
                num = "baz";
            }
            else if (i % 3 == 0)
            {
                num = "foo";
            }
            else if (i % 5 == 0)
            {
                num = "bar";
            }
            else
            {
                num = String.valueOf(i);
            }
            answer = answer + num + ", ";
        }
        System.out.println(answer);
    }


}
