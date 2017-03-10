
package heap.sort;

public class Build_Max_Heap 
{   
    public static void BMHeap(int[] A)
    {   int len=A.length;
        int nonleaf=(len/2)-1;
        //System.out.println(nonleaf);
        Max_Heapify mh=new Max_Heapify();
        for(int i=nonleaf;i>=0;i--)
            mh.MHeapify(A,i,--len);
    }
}
