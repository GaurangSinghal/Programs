package heap.sort;

public class HeapSort
{
    public static void HSort(int[] A)
    {   Build_Max_Heap b=new Build_Max_Heap();
        b.BMHeap(A);
        int j;
        int len=A.length;
        --len;
        Max_Heapify m=new Max_Heapify();
        for(int i=len;i>=1;--i)
        {   swap(A,i);
            j=i-1;
            m.MHeapify(A,0,j);        
        }
    }
    
    public static void swap(int[] A,int i)
    {   int temp=A[i];
        A[i]=A[0];
        A[0]=temp;
    }
    
    public static void display(int[] A)
    {   for(int i=0;i<=9;i++)
          System.out.print(A[i]+" ");
          System.out.println();          
    }
    
    public static void main(String[] args)
    {
        int[] A={10,7,9,8,6,5,1,4,3,2};
        display(A);
        HSort(A);
        display(A);
    }    
}
