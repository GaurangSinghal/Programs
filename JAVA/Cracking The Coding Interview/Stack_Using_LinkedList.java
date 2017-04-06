package pkg3.pkg3;

public class Stack_Using_LinkedList 
{
    Node top=null;    
    Node bottom =null;
    public void push(int val)
    {   Node n=new Node(val);
        if(bottom==null)
            bottom=n;
        if(top!=null)
           n.link=top;
        top=n;  
    }
    
    public void display()
    {   Node n=top;
        while(n!=null)
        {   System.out.print(n.key+ " ");
            n=n.link;
        }
        System.out.println();
    }
    
    public int pop()
    {   if(top.link==null)
            bottom=null;
        int val=top.key;
        top=top.link;
        return val;
    }
    
    public int peek()
    {   return top.key;
    }
    
    public int capacity()
    {   Node n=top;
        int c=0;
        while(n!=null)
        {   n=n.link;
            ++c;
        }
        return c;
    }
    
    public void recurse(Node n)
    {   if(n.link==null)
            return;
        recurse(n.link);
        n.link.key=n.key;
    }
}
