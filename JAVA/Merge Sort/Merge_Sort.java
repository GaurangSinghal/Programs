package merge_sort;


public class Merge_Sort
{   
    public static void MSort(int[] A,int p,int q)
    {   Merge m=new Merge();
        if(p<q)
        {   int mid=(p+q)/2;
            MSort(A,p,mid); 
            MSort(A,mid+1,q);   
            m.Merged(A,p,mid,q);
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
        //display(A,p,q);
        MSort(A,p,q);
        p=0;
        q=9;
        display(A,p,q);
    }    
}
