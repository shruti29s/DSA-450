import java.util.*;

public class mergeWithoutExtraSpace {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        //Time Complexity : ((n+m)*log(n+m))
        int i=n-1, j=0;
        while(i>=0 && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i--;
                j++;
            }
            else{
                break;
            } 
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
