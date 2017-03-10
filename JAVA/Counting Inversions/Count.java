
package counting.inversions;

import java.util.ArrayList;
import java.util.List;

public class Count 
{
    static int c=0;
    public static int Merged(int[] A,int p,int mid,int q)
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
                c+=first.size()-j-1;
            }
        }
        //System.out.println(c);
        return c;
    }    
}
