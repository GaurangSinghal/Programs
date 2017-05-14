package pkg5.pkg7;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {   int a[]={2,9,6,7,8,5,3,4,0};
        ArrayList b=new ArrayList();
        b.add(2);
        b.add(9);
        b.add(6);
        b.add(1);
        b.add(8);
        b.add(5);
        b.add(3);
        b.add(4);
        b.add(0);
        System.out.println(findMissing(b));
    }    
    
    public static int findMissing(ArrayList<Integer> a)
    {   if(a.isEmpty())
            return 0;
        ArrayList even= new ArrayList();
        ArrayList odd= new ArrayList();
        int n,p;
        for(int i=0;i<a.size();i++)
        {   n=a.get(i);
            p=n>>1;
            if(n%2==1)
                odd.add(p);
            else
                even.add(p);          
        }
        if(even.size()>odd.size())
        {   int v=findMissing(odd);
            return (v<<1)|1;
        }
        else
        {   int v=findMissing(even);
            return (v<<1)|0;
        }            
    }
}
