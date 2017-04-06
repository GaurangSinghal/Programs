package pkg3.pkg2;

public class Main
{
    Node top=null;
    int minim=0;
    public static void main(String[] args) 
    {   Main st=new Main();
        st.push(76);    
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(70);
        st.display();
        st.findMin();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.peek());
        st.findMin();
    }
    
    public void push(int val)
    {   Node n=new Node(val);
        if(top!=null)
        {   n.link=top;
            minim=Math.min(n.key,minim);
        }
        else 
            minim=n.key;
        n.min=minim;
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
    {   int val=top.key;
        top=top.link;
        minim=top.min;
        return val;
    }
    
    public void findMin()
    {   System.out.println(minim);
    }
    
    public int peek()
    {   return top.key;
    }  
}
