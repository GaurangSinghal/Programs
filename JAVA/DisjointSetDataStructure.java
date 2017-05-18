package disjoint.set.data.structure;

import java.util.Arrays;
import java.util.Scanner;

public class DisjointSetDataStructure
{
    public static void main(String[] args) 
    {   Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] parent=new int[N];
        int[] size=new int[N];
        for(int i=0;i<N;i++)
        {   parent[i]=i;   
            size[i]=1;
        }
        int n1,n2;
        for(int i=1;i<=M;i++)
        {   n1=sc.nextInt();
            n2=sc.nextInt();
            join(parent,size,n1-1,n2-1);
            display(size);
        }
    }
    
    public static void join(int[] parent, int[] size, int n1, int n2)
    {   int rt_n1=root(parent,n1);
        int rt_n2=root(parent,n2);
        if(rt_n1!=rt_n2)
        {   if(size[n1]>size[n2])
            {   parent[rt_n2]=rt_n1;
                size[rt_n1]+=size[rt_n2];
                size[rt_n2]=0;
            }
            else
            {   parent[rt_n1]=rt_n2;
                size[rt_n2]+=size[rt_n1];
                size[rt_n1]=0;
            }
        }
    }
    
    public static int root(int[] A, int n)
    {   if(A[n]!=n)
           A[n]=root(A,A[n]);            // using path compression
        
        return A[n];
    }
    
    public static void display(int[] size)   // to display the size of components in ascending order
    {   int[] b= size.clone();
        Arrays.sort(b);
        for(int a:b)
        {   if(a!=0)
                System.out.print(a+" ");
        }
        System.out.println();
    }
}
