
package binary_search;

import java.util.Scanner;


public class Binary_Search 
{
    static boolean b;
    
    public static void main(String[] args)
    {
        int[] A={1,2,3,4,5,6,7,8,9,10};
        display(A);
        int p=0;
        int q=A.length-1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=BSearch(A,n,p,q);
        if(b==true)
            System.out.println("found");
        else
            System.out.println("not found");
        if(ans!=-1)
            System.out.println(ans);
    }
    
    public static int BSearch(int[] A, int n,int p,int q)
    {   int ans,mid =(p+q)/2;
        b=false;
        if(A[mid]==n)
        {   b=true;
            return mid;
        }
        if(A[mid]!=n && p==q)
            return -1;
        if(A[mid]>n)
            ans=BSearch(A,n,p,mid);
        else
            ans=BSearch(A,n,mid+1,q);
        
        return ans;
    }
    
    public static void display(int[] A)
    {   for(int i=0;i<=9;i++)
        System.out.print(A[i]+" ");
        System.out.println();
    }
}
