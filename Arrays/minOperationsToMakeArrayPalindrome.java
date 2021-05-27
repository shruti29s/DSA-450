/*Input : arr[] = {15, 4, 15}
Output : 0
Array is already a palindrome. So we
do not need any merge operation.

Input : arr[] = {1, 4, 5, 1}
Output : 1
We can make given array palindrome with
minimum one merging (merging 4 and 5 to
make 9)

Input : arr[] = {11, 14, 15, 99}
Output : 3
We need to merge all elements to make
a palindrome.*/

import java.util.*;

public class minOperationsToMakeArrayPalindrome {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0, j=n-1;
        int moves = 0;
        while(i<=j)
        {
            if(arr[i]==arr[j])
            {
                i++;
                j--;
            }
            else if(arr[i]<arr[j])
            {
                i++;
                arr[i]+=arr[i-1];
                moves++;
            }
            else{
                j--;
                arr[j]+=arr[j+1];
                moves++;
            }
        }
        System.out.println(moves);
    }
}
