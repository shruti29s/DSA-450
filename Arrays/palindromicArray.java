import java.util.*;

public class palindromicArray {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int f=1;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            int rev=0;
            while(temp>0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(rev!=arr[i])
            {
                f=0;
                break;
            }
        }
        System.out.println(f);
    }
}
