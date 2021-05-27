import java.util.*;

public class medianOf2SortedArraysOfEqualSize {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int arr2[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }

        /**********     METHOD 1       ********** */
        //Time Complexity: O(n)
        int i=0, j=0;
        int m1=-1, m2=-1;
        for(int count=0;count<=n;count++)
        {
            if(i==n)
            {
                m1=m2;
                m2=arr2[0];
                break;
            }
            if(j==n)
            {
                m1=m2;
                m2=arr1[0];
                break;
            }
            if(arr1[i]<=arr2[j])
            {
                m1=m2;
                m2=arr1[i];
                i++;
            }
            else{
                m1=m2;
                m2=arr2[j];
                j++;
            }
        }
        System.out.println((m1+m2)/2);

        /**********     METHOD 2       ********** */
        //Time Complexity: O(log n)
        if(n==0)
        {
            System.out.println("Arrays are empty");
        }
        else if(n==1)
        {
            System.out.println((arr1[0]+arr2[0])/2);
        }
        else{
            System.out.println(getMedian(arr1, arr2, 0, 0, n-1, n-1));
        }
    }

    static int getMedian(int[] a, int[] b, int startA, int startB, int endA, int endB)
    {
        if(endA-startA==1)
        {
            return (Math.max(a[startA], b[startB])+Math.min(a[endA], b[endB]))/2;
        }

        int m1 = median(a, startA, endA);
        int m2 = median(b, startB, endB);

        if(m1==m2)
            return m1;
        else if(m1<m2)
        {
            return getMedian(a, b, (startA+endA+1)/2, startB, endA, (startB+endB+1)/2);
        }
        return getMedian(a, b, startA, (startB+endB+1)/2, (startA+endA+1)/2, endB);
    }

    static int median(int[] a, int start, int end)
    {
        int n=end-start+1;
        if(n%2!=0)
        {
            return a[start+n/2];
        }
        return (a[start+n/2]+a[start+(n/2-1)])/2;
    }
}
