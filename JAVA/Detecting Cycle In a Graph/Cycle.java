package detecting.cycle.in.a.graph;

import java.util.Arrays;
import java.util.Scanner;

public class Cycle 
{
    public static void main(String[] args) 
    {   int N=8;
        int[] parent=new int[N];
        int[] size=new int[N];
        for(int i=0;i<N;i++)
        {   parent[i]=i;   
            size[i]=1;
        }
        join(parent,size,0,1);
        join(parent,size,5,7);
        join(parent,size,0,5);
        join(parent,size,1,2);
        join(parent,size,6,7);
        join(parent,size,5,4);
        join(parent,size,3,7);         
    }
    
    public static void join(int[] parent, int[] size, int n1, int n2)
    {   int rt_n1=root(parent,n1);
        int rt_n2=root(parent,n2);
        if(rt_n1!=rt_n2)
        {   if(size[n1]>size[n2])              // using union by rank heauristic
            {   parent[rt_n2]=rt_n1;
                size[rt_n1]+=size[rt_n2];        
            }
            else
            {   parent[rt_n1]=rt_n2;
                size[rt_n2]+=size[rt_n1];
            }
        }
        else
            System.out.println("Contains Cycle");
    }
    
    public static int root(int[] A, int n)
    {   if(A[n]!=n)
           A[n]=root(A,A[n]);            // using path compression heuristic
        
        return A[n];
    }
}
