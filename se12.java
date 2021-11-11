import java.util.*;
import java.lang.*;
class se12
{
  public static void main(String arg[])
   {
     try
         {
            String s="brown for jumbs over lazy dog";
             StringBuilder sb=new StringBuilder(s);
              System.out.println(sb.substring(3,9));
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}