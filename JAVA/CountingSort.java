package counting.sort;

public class CountingSort 
{
    public static void main(String[] args)
    {   CountingSort cs=new CountingSort();
        int[] a={7,4,2,6,3,3,5,7};
        cs.sort(a);
    }    
    
    public void sort(int[] a)
    {   int max=max(a);
        int i;
        int len=a.length;
        int[] count=new int[max+1];
        for(i=0;i<len;i++)
           ++count[a[i]];
        for(i=1;i<count.length;i++)
            count[i]+=count[i-1];
        int[] out=new int[len];
        for(i=len-1;i>=0;i--)
        {   out[count[a[i]]-1]=a[i];
            --count[a[i]];
        }
        System.out.println(out);
    }
    
    public int max(int[] a)
    {   int max=a[0];
        for(int i=1;i<a.length;i++)
        {   if(a[i]>max)
                max=a[i];
        }
        return max;
    }
}
