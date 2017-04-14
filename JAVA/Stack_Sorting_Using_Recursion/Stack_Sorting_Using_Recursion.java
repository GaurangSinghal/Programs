package Stack_Sorting_Using_Recursion;

import java.util.Stack;

public class Stack_Sorting_Using_Recursion 
{
   public static void main(String[] args)
    {   Stack<Integer> s=new Stack<Integer>();
        for(int i=10;i>0;i--)
            s.push(i);
        System.out.println(s);
        sort(s);
        System.out.println(s);
    }    
    public static void sort(Stack<Integer> s)
    {   if(s.empty())
            return;
        int val=s.pop();
        sort(s);
        insert(s,val);
    }
    public static void insert(Stack<Integer> s,int val)   
    {   if(s.empty())
        {   s.push(val);
        }
        else
        {   int temp1;
            int temp=s.pop();
            if(temp<val)
            {   temp1=temp;
                temp=val;
                val=temp1;
            }
            insert(s,val);
            s.push(temp);
        }
    }
    
}
