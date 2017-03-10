package quick.sort;

public class QuickSort 
{
    public static void QSort(int[] A, int p, int q)
    {   Partition pr=new Partition();
        int ind;
        if(p<q)
        {   ind=pr.index(A,p,q);
            QSort(A,p,ind-1);
            QSort(A,ind+1,q);
        }
    }
    
    public static void display(int[] A, int p, int q)
    {   for(int i=p;i<=q;i++)
        System.out.print(A[i]+" ");
        System.out.println();
    }
    
    public static void main(String[] args)
    {   int[] A={10,7,9,8,6,5,1,4,3,2};
        int p=0,q=9;
        display(A,p,q);
        QSort(A,p,q);
        p=0;
        q=9;
        display(A,p,q);        
    }    
}
