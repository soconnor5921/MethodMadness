//Sullivan O'Connor 9/20/18
package soconnor;

import static soconnor.soconnorLib.isPalindrome;
import static soconnor.soconnorLib.println;
import static soconnor.soconnorLib.reverse;
import static soconnor.soconnorLib.cutOut;



public class testFile
{
    public static void main(String[] args)
    {
        println(reverse("word"));
        boolean palindrome = isPalindrome("car");
        println(String.valueOf(palindrome));

        println(cutOut("catatonic cat","cat"));


    }
}
