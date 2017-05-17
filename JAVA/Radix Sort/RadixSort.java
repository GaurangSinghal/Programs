package radix.sort;

public class RadixSort
{
    public static void main(String[] args)
    {   RadixSort cs=new RadixSort();
        int a[] = {170, 45, 75, 90, 802, 24, 2, 66};
        a=cs.sort(a);
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }    
    
    public int[] sort(int[] a)
    {   int max=max(a);
        int i,exp;
        int len=a.length;
        int[] out=new int[len];
        for(exp=1;max/exp>0;exp*=10)
        {   out=new int[len];         
            int[] count=new int[10];            
            for(i=0;i<len;i++)
               ++count[(a[i]/exp)%10];
            for(i=1;i<10;i++)
                count[i]+=count[i-1];
            for(i=len-1;i>=0;i--)
            {   out[count[(a[i]/exp)%10]-1]=a[i];
                --count[(a[i]/exp)%10];
            }
            a=out;
        }
        return out;
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
