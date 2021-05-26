import java.util.*;
import java.io.*;

public class minimizeHeights {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        ArrayList<Pair> a=new ArrayList<Pair>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]-k>=0)
                a.add(new Pair(arr[i]-k, i));
            a.add(new Pair(arr[i]+k, i));
        }
        Collections.sort(a, new MyCmp());
        int visited[]=new int[n];
        int element=0;
        int left=0, right=0;
        for(int i=0;i<a.size();i++)
        {
            visited[a.get(i).y]++;
            if(visited[a.get(i).y]==1)
            {
                element++;
            }
            if(element==n)
            {
                right=i;
                break;
            }
        }
        int min=a.get(right).x-a.get(left).x;
        right++;
        while(right<a.size())
        {
            visited[a.get(left).y]--;
            if(visited[a.get(left).y]==0)
                element--;
            left++;
            while(element<n && right<a.size())
            {
                if(visited[a.get(right).y]==0)
                {
                    element++;
                }
                visited[a.get(right).y]++;
                right++;
            }
            if(element==n)
            {
                min=Math.min(min, a.get(right-1).x-a.get(left).x);
            }
        }
        System.out.println(min);
    }
}

class Pair
{
    int x, y;
    Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}

class MyCmp implements Comparator<Pair>
{
    public int compare(Pair p1, Pair p2)
    {
        return p1.x-p2.x;
    }
}