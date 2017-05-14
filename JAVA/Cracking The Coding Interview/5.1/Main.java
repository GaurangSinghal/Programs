package pkg5.pkg1;

public class Main 
{
    public static void main(String[] args)
    {   fit(1024,19,6,2);
    }    
    
    public static void fit(int N, int M, int j, int i)
    {   int p=N & (-1<<(j+1));
        int q=N & ~(-1<<i);
        N= p|q|(M<<i);
        System.out.println(p);
        System.out.println(q);
        System.out.println(N);
    }
}
