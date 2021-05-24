import java.util.*;
import java.lang.*;
import java.io.*;

class reverse_a_string
{
	public static void main (String[] args) throws java.lang.Exception
	{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        String str = in.readLine();

        /**********     METHOD 1       ********** */
        //Converting string into an array of characters

        char[] s = str.toCharArray();
        int n = str.length();
        for(int i=0;i<n/2;i++)
        {
            char t=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=t;
        }
        System.out.println(String.valueOf(s));

        /**********     METHOD 2       ********** */
        //Using StringBuilder

        StringBuilder s1=new StringBuilder(str);
        s1.reverse();
        System.out.println(s1.toString());
    }
}