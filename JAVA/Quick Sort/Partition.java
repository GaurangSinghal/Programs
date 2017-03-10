
package quick.sort;

public class Partition 
{
    public static int index(int[] A, int p, int q)
    {   int i=p-1, j, temp=0;
        for(j=p;j<q;j++)
        {   if(A[j]<=A[q])
            {   ++i;
                //System.out.print(i+" ");
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        temp=A[++i];
        A[i]=A[j];
        A[j]=temp;
        return i;
    }
}
