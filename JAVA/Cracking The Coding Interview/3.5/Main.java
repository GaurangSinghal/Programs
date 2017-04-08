package pkg3.pkg5;

import java.util.Stack;

public class Main 
{   
    Stack<Integer> s1=new Stack();
    Stack<Integer> s2=new Stack<>();
    
    public static void main(String[] args) 
    {   Main m=new Main();
        for(int i=0;i<7;i++)
            m.enqueue(i);
        System.out.println(m.s1+" "+m.s2);
        m.dequeue();
        m.enqueue(10);
        m.dequeue();
        System.out.println(m.s1+" "+m.s2);
    }    
    
    public void enqueue(int n)
    {   s1.push(n);
    }
    
    public int dequeue()
    {   int val=0;
        if(s2.empty())
        {   while(!s1.empty())
                s2.push(s1.pop());
        }
        val=s2.pop();      
        return val;
    }
}
