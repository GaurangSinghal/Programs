package stack_using_linkedlist;

public class Stack_Using_LinkedList 
{
   Node top=null;
    public static void main(String[] args) 
    {   Stack_Using_LinkedList st=new Stack_Using_LinkedList();
        st.push(100);    
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        st.display();
        st.peek();
        st.pop();
        st.pop();
        System.out.println(st.peek());
    }
    
    public void push(int val)
    {   Node n=new Node(val);
        if(top!=null)
           n.link=top;
        top=n;                   
    }
    
    public void display()
    {   Node n=top;
        while(n!=null)
        {   System.out.println(n.key);
            n=n.link;
        }
    }
    
    public int pop()
    {   int val=top.key;
        top=top.link;
        return val;
    }
    
    public int peek()
    {   return top.key;
    }
}
