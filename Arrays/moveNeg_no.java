import java.util.*;
import java.io.*;

public class moveNeg_no{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        /**********     METHOD 1       ********** */
        //Time complexity: O(n)
        //Space Complexity: O(1)
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                l++;
            }
        }

        /**********     METHOD 2       ********** */
        //Two Pointer Technique
        //Time complexity: O(n)
        //Space Complexity: O(1)
        l=0;
        int r=n-1;
        while(l<=r)
        {
            if(arr[l]<0 && arr[r]<0)
            {
                l++;
            }
            else if(arr[l]>0 && arr[r]>0)
            {
                r--;
            }
            else if(arr[l]>0 && arr[r]<0)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            else{
                l++;
                r--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}