import java.util.*;
import java.io.*;

public class kthSmallestElement {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        /**********     METHOD 1       ********** */
        //By sorting the array
        //Time Complexity: O(nlogn)
        //Space Complexity: O(1)
        Arrays.sort(a);
	    System.out.println(a[k-1]);

        /**********     METHOD 2       ********** */
        
    }
}
