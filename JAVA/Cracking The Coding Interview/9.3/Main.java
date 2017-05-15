package pkg9.pkg3;

public class Main 
{
    public static void main(String[] args)
    {   Main m=new Main();
        int [] a={-10,-5,2,2,2,3,4,8,9,12,13};
        System.out.println(m.alt_magic(a,0,a.length-1));
    }
    
    public int magic(int[] a, int strt, int end)   // if all elements are distinct
    {   if(strt>end || strt<0 || end>=a.length)
            return -1;
        int mid=(strt+end)/2;
        if(a[mid]==mid)
            return mid;
        if(a[mid]<mid)
        {   
            return magic(a,mid+1,end);
        }
        else
            return magic(a,strt,mid-1);
    }
    
    public int alt_magic(int[] a, int strt, int end)    // if elements are not distinct
    {   if(strt>end || strt<0 || end>=a.length)
            return -1;
        int mid=(strt+end)/2;
        if(a[mid]==mid)
            return mid;
        int ck=check(a,a[mid]);
        if(ck!=-1)
            return ck;
        
        if(a[mid]<mid)
            return alt_magic(a,mid+1,end);
        else
            return alt_magic(a,strt,mid-1);
    }
    
    public int check(int[] a,int n)
    {   if(n<0 || n>=a.length)
            return -1;
        if(a[n]==n)
            return n;
        return check(a,a[n]);    
    }
}
