package pkg1.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {   ArrayList<ArrayList<Integer>> outer= new ArrayList<>();
        ArrayList<Integer> inner=new ArrayList<>();
        int i,j,N,n;
        Scanner sc=new Scanner(System.in);
         N=sc.nextInt();
        for(i=0;i<N;i++)
        {   for(j=0;j<N;j++)
            {
                n=sc.nextInt();
                inner.add(n);
            }
            outer.add(inner);
            inner=new ArrayList<>();
        }
        System.out.println(outer);  
        rotate(outer,N);
        System.out.println(outer);        
    }
    
    public static void rotate(ArrayList<ArrayList<Integer>> outer,int N)
    {   int i,j,l,k,store;
        for(i=0;i<N/2;i++)
        {   for(j=i;j<N-1-i;j++)
            {   store=outer.get(i).get(j);
                outer.get(i).set(j,outer.get(N-1-j).get(i));
                outer.get(N-1-j).set(i,outer.get(N-1-i).get(N-1-j));
                outer.get(N-1-i).set(N-1-j, outer.get(j).get(N-1-i));
                outer.get(j).set(N-1-i,store);
            }
        }
    }    
}
