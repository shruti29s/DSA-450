import java.util.*;
import java.io.*;

public class largestSumContigousSubarray {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int local_max=0, global_max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            local_max=Math.max(arr[i], arr[i]+local_max);
            global_max=Math.max(local_max, global_max);
        }
        System.out.println(global_max);
    }
}
