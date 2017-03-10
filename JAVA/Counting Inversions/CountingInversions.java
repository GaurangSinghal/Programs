package counting.inversions;

public class CountingInversions
{
    static int c=0;
    public static void MSort(int[] A,int p,int q)
    {   Count m=new Count();
        if(p<q)
        {   int mid=(p+q)/2;
            MSort(A,p,mid); 
            MSort(A,mid+1,q);   
            c=m.Merged(A,p,mid,q);
            //System.out.println(c);
        }        
    }
    
    public static void display(int[] A, int p, int q)
    {   for(int i=p;i<=q;i++)
          System.out.print(A[i]+" ");
          System.out.println();          
    }
    
    public static void main(String[] args)
    {   int[] A={10,9,8,7,6,5,4,3,2,1};
        int p=0,q=9;
        display(A,p,q);
        MSort(A,p,q);
        p=0;
        q=9;
        System.out.println(c); //Answer.....
        display(A,p,q);
    }    
    
}
