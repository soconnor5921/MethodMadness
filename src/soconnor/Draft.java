//Sullivan O'Connor 9/20/18
package soconnor;

public class Draft
{
    public static void multiplicationTable(int base, int range)
    {
        String answer = "";
        for(int i = 0; i < range; i++)
        {
            String multiplied = String.valueOf(base*i);
            answer = answer + multiplied + ", ";
        }
        System.out.println(answer);

    }
}
