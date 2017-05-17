package sieve.of.eratosthenes;

import java.util.ArrayList;

public class SieveOfEratosthenes 
{  
    public static void main(String[] args) 
    {   SieveOfEratosthenes m=new SieveOfEratosthenes();
        m.prime(30);
    }   
    
    public void prime(int n)
    {   int i,prm=2;
        boolean[] p= new boolean[n+1];
        mark(p);
        while(prm<=Math.sqrt(n))
        {   delete(p,prm);
            prm=nextPrime(p,prm);
        }
        display(p);
    }
    
    public void mark(boolean[] p)
    {   for(int i=0;i<p.length;i++)
            if(i==0 || i==1)
                p[i]=false;
            else
                p[i]=true;
    }
    
    public void delete(boolean[] p, int prm)
    {   for(int i=prm*prm; i<p.length; i+=prm)
        {   p[i]=false;
        }
    }
    
    public int nextPrime(boolean[] p, int prm)
    {   ++prm;
        while(prm<p.length && p[prm]!=true)
            ++prm;
        return prm;    
    }
    
    public void display(boolean[] p)
    {   for(int i=0;i<p.length;i++)
            if(p[i]== true)
                System.out.print(i+"  ");
        System.out.println();        
    }
   
}
