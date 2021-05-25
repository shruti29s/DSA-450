import java.util.*;
import java.io.*;

public class union {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0;i<m;i++)
        {
            brr[i]=sc.nextInt();
        }

        /**********     METHOD 1       ********** */
        //Using set
        //Time Complexity: O(m+n)
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            h.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            h.add(b[i]);
        }
        System.out.println( h.size());

        /**********     METHOD 2       ********** */
        //Sorting the smaller array and applying binary search on the smaller for larger array
        //Time Complexity: O((m+n)logm, (m+n)logn)
        int u[]=new int[m+n];
        if(n>m)
        {
            int temp[]=arr;//Swapping array
            arr=brr;
            brr=temp;

            int t=m;
            m=n;
            n=t;
        }
        //Now the smallest array is arr with size n
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<n;i++)
        {
            u[j++]=arr[i];
        }
        for(int i=0;i<m;i++)
        {
            if(binarySearch(arr, n, brr[i])==-1)
            {
                u[j++]=brr[i];
            }
        }
        System.out.println(j);
    }
}
