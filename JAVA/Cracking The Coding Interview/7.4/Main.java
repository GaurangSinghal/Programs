package pkg7.pkg4;

public class Main 
{
    public static void main(String[] args) 
    {   
        System.out.println(new Main().divide(-5,5));
    }    
    
    public int negate(int a)
    {   int d;
        if(a>0)
            d=-1;
        else
            d=1;
        int c=0;
        while(a!=0)
        {   a+=d;
            c+=d;
        }
        return c;
    }
    
    public int divide(int a, int b)
    {   if(b==0)
            return -1;
        int n1=a, n2=b;
        a=Math.abs(a);
        b=Math.abs(b);
        b=negate(b);
        int c=0;
        while(a>0)
        {   a=a+b;
            ++c;
        }
        if(a!=0)
            c=c+negate(1);
        if((n1>=0 && n2>0) || (n1<=0 && n2<0))       
            return c;
        else 
            return negate(c);
    }
}
