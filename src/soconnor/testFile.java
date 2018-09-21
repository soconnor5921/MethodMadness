//Sullivan O'Connor 9/20/18
package soconnor;

import static soconnor.soconnorLib.isPalindrome;
import static soconnor.soconnorLib.println;
import static soconnor.soconnorLib.cutOut;
import static soconnor.soconnorLib.sumUpTo;
import static soconnor.soconnorLib.multiplicationTable;




public class testFile
{
    public static void main(String[] args)
    {
        boolean palindrome = isPalindrome("car");
        boolean palindrome1 = isPalindrome("racemaniac");
        println(String.valueOf(palindrome));
        println(String.valueOf(palindrome1));

        println(cutOut("catatonic cat","cat"));

        println(String.valueOf(sumUpTo(10)));

        multiplicationTable(2,10);




    }
}
