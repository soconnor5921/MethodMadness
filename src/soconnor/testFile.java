//Sullivan O'Connor 9/20/18
package soconnor;

import static soconnor.soconnorLib.isPalindrome;
import static soconnor.soconnorLib.println;
import static soconnor.soconnorLib.cutOut;
import static soconnor.soconnorLib.sumUpTo;




public class testFile
{
    public static void main(String[] args)
    {
        boolean palindrome = isPalindrome("car");
        println(String.valueOf(palindrome));

        println(cutOut("catatonic cat","cat"));

        println(String.valueOf(sumUpTo(10)));




    }
}
