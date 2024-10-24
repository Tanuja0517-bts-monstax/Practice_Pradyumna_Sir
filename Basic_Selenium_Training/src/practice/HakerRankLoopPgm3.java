package practice;
import java.util.*;
import java.io.*;

public class HakerRankLoopPgm3 {

	    public static void main(String []argh)
	    {
	        Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {
	        	 try
	                {
	                    long num=sc.nextLong();
	                    if(num>=-128 && num<=127)
	                        System.out.println(num+" can be fitted in:\n* byte\n* short\n* int\n* long");
	                        
	                    else if(num>=-32768 && num<=32767)
	                        System.out.println(num+" can be fitted in:\n* short\n* int\n* long");
	        
	                   else if(num>-2147483648 && num<=2147483647) 
	                        System.out.println(num +" can be fitted in:\n* int\n* long");
	                    
	                    else if(num>=-9223372036854775808l && num<=9223372036854775807l)
	                        System.out.println(num+ " can be fitted in:\n* long");
	                    
	                }
	                catch(Exception e)
	                {
	                    System.out.println(sc.next()+" can't be fitted anywhere.");
	                }

	        }
	   }
}
/* 22
 * 0
1
-1
18446744073709551616
-18446744073709551616
18446744073709551615
-18446744073709551616
32768
-32768
32767
-32767
2147483648
2147483647
-2147483648
-2147483647
128
127
-128
-127
123123123333333333333333333333333313123123
234444444444444444444444444444444444444
-1222222*/
