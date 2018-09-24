//Sullivan O'Connor 9/20/18
package soconnor;

public class Draft
{
   public static void fooBarBaz(int num1)
   {
       String answer = "";
       for(int i =0; i < num1; i++)
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
