package reversiing.a.stack;

import java.util.Stack;

public class ReversiingAStack 
{
    public static void main(String[] args)
    {   Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<10;i++)
            s.push(i);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }    
    public static void reverse(Stack<Integer> s)
    {   if(s.empty())
            return;
        int val=s.pop();
        reverse(s);
        insert(s,val);
    }
    public static void insert(Stack<Integer> s,int val)   
    {   if(s.empty())
            s.push(val);
        else
        {   int temp=s.pop();
            insert(s,val);
            s.push(temp);
        }
    }
}
