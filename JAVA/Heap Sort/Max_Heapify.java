
package heap.sort;

public class Max_Heapify 
{   
    public static void MHeapify(int[] A, int i, int j)  //j= size of heap
    {   //display(A);
        //System.out.println(i+" "+j);
        int l=2*i+1;
        int r=2*i+2;
        int largest=i;
        if(l<=j && A[i]<A[l])
            largest=l;
        if(r<=j && A[largest]<A[r])
            largest=r;
        if(largest!=i)
        {   swap(A,i,largest);
            MHeapify(A,largest,j);}
    }
    
    public static void swap(int[] A,int i,int la)
    {   int temp=A[i];
        A[i]=A[la];
        A[la]=temp;
    }
    
    /*public static void display(int[] A)
    {   for(int i=0;i<=9;i++)
          System.out.print(A[i]+" ");
          System.out.print(" : ");          
    }*/
}
