import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if(m >= n)
                System.out.println(n);
            else
                System.out.println((n - m) + n);
        }
	}
}
