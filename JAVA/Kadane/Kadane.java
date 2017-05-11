package kadane;

import java.util.Scanner;

public class Kadane
{
    public static void main(String[] args) 
    {   int[] a;  
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum;
        int max;
        int n;
        while(t!=0)
        {   n=sc.nextInt();
            a=new int[n];            
            for(int i=0;i<n;i++)
            {   a[i]=sc.nextInt();
            }
            sum=a[0];
            max=a[0];
            for(int i=1;i<n;i++)
            {   if(sum>0)
                {   sum=sum+a[i];
                    if(sum>max)
                        max=sum;
                }
                else
                {   if(a[i]>sum)
                    {   sum=a[i];
                        if(sum>max)
                        max=sum;
                    }
                }
            }
            System.out.println(max);
            --t;
        }
    }    
}
