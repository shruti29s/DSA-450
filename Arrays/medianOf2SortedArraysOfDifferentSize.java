import java.util.*;

public class medianOf2SortedArraysOfDifferentSize {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }

        /**********     METHOD 1       ********** */
        //Time Complexity: O(m+n)
        int l=(n+m)/2;
        int i=0, j=0;
        int m1=-1, m2=-1;
        for(int count=0;count<=l;count++)
        {
            m1=m2;
            if(i!=n && j!=m)
            {
                if(a[i]<=b[j])
                {
                    m2=a[i];
                    i++;
                }
                else{
                    m2=b[j];
                    j++;
                }
            }
            else if(i<n)
            {
                m2=a[i];
                i++;
            }
            else{
                m2=b[j];
                j++;
            }
        }
        if((m+n)%2==1)
             System.out.println(m2);
        System.out.println(((double)m1+(double)m2)/2);

        /**********     METHOD 2       ********** */
    }
}
