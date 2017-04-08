package pkg3.pkg4;

import java.util.Stack;

public class Main 
{
    public static void main(String[] args) 
    {   Stack start=new Stack();
        Stack middle=new Stack();
        Stack end=new Stack();
        for(int i=5;i>=1;i--)
            start.add(i);
        
        TOH(start,middle,end,5);     
        System.out.println(start);
        System.out.println(middle);
        System.out.println(end);
    }
    
    public static void TOH(Stack start,Stack middle,Stack end,int n)
    {   if(n==1)
        {   end.push(start.pop());
            return;
        }       
        TOH(start,end,middle,n-1);
        end.push(start.pop());
        TOH(middle,start,end,n-1);
    }  
}
