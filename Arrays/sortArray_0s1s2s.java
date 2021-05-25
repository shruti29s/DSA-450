import java.util.*;
import java.io.*;

public class sortArray_0s1s2s {
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
        int l=0, i=0, h=n-1;
        while(i<=h)
        {
            if(arr[i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                l++;
                i++;
            }
            else if(arr[i]==1)
            {
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[h];
                arr[h]=temp;
                h--;
            }
        }

        /**********     METHOD 2       ********** */
        //Counting no of 0s, 1s, 2s
        //Time complexity: O(n)
        //Space Complexity: O(1)
        int c0=0, c1=0, c2=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else
                c2++;
        }
        i=0;
        while(c0>0){
            arr[i++]=0;
            c0--;
        }
        while(c1>0){
            arr[i++]=1;
            c1--;
        }
        while(c2>0){
            arr[i++]=2;
            c2--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
