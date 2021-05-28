import java.util.*;

public class kadaneAlgorithm {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int local_max=0, global_max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            local_max=Math.max(a[i], a[i]+local_max);
            global_max=Math.max(local_max, global_max);
        }
        System.out.println(global_max);
    }
}
