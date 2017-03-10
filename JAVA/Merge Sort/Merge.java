
package merge_sort;

import java.util.ArrayList;
import java.util.List;

public class Merge 
{   
    public static void Merged(int[] A,int p,int mid,int q)
    {   List<Integer> first=new ArrayList<Integer>();
        List<Integer> second=new ArrayList<Integer>();
        int i,j=0,k=0;
        for(i=p;i<=mid;i++)
           first.add(A[i]);        
        first.add(100);
        for(i=mid+1;i<=q;i++)
           second.add(A[i]); 
        second.add(100);
        
        for(i=p;i<=q;i++)
        {   if(first.get(j)<=second.get(k))
            {   A[i]=first.get(j);
                j++;
            }
            else
            {   A[i]=second.get(k);
                k++;
            }
        }
    }
}
