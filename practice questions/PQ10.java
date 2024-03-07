import java.util.*;
import java.lang.*;
import java.io.*;

class PQ10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0)
		{
		        int b1,b2,b3;
		        b1=sc.nextInt();
		        b2=sc.nextInt();
		        b3=sc.nextInt();
		        
		       
		        if((b1==0 && b2==0)||(b1==0 && b3==0) || (b2==0)&&(b3==0)) 
		        System.out.println("Water filling time");
		        else 
		        System.out.println("Not now");
		}
	}
}