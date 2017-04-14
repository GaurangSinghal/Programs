package stack_merge_sort;

import java.util.Stack;

public class Stack_Merge_Sort 
{
    public static void main(String[] args) 
    {   Stack_Merge_Sort sm=new Stack_Merge_Sort();
        Stack s=new Stack();
        s.push(3);
        s.push(5);
        s.push(10);
        s.push(8);
        s.push(9);
        s.push(7);
        s.push(4);
        s.push(11);
        System.out.println(s);
        System.out.println(sm.sort(s));
       
    }   
    
    public Stack<Integer> sort(Stack<Integer> s)
    {   if(s.size()==1 || s.size()==0)
            return s;
        Stack<Integer> s1=new Stack();
        Stack<Integer> s2=new Stack();
        while(!s.isEmpty())
        {   s1.push(s.pop());
            if(s.empty())
                break;
            s2.push(s.pop());
        }
        s1=sort(s1);
        s2=sort(s2);
        s1=reverse(s1);
        s2=reverse(s2);    
        return merge(s1,s2);
    }
    
    public Stack<Integer> merge(Stack<Integer> s1, Stack<Integer> s2)
    {   Stack s=new Stack();
        while(!s1.empty() && !s2.empty())
        {   if(s1.peek()<s2.peek())
            {   s.push(s2.pop());
            }
            else
            {   s.push(s1.pop());
            }
        }
        while(!s1.empty())
        {   s.push(s1.pop());
        }
        while(!s2.empty())
        {   s.push(s2.pop());
        }
        return s;
    }    
    
    public static Stack<Integer> reverse(Stack<Integer> s)
    {   Stack<Integer> s1=new Stack<>();
        while(!s.empty())
            s1.push(s.pop());
        return s1;
    }
 
}