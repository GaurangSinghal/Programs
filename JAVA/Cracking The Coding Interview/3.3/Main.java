package pkg3.pkg3;

import java.util.ArrayList;

public class Main 
{  
    static ArrayList<Stack_Using_LinkedList>  al= new ArrayList();
    static int limit=5;
    
    public static void main(String[] args) 
    {   Stack_Using_LinkedList st=new Stack_Using_LinkedList();
        al.add(st);
        for(int i=1;i<14;i++)
            push(i);
        display();
        //for(int i=1;i<6;i++)
           // pop();
           
        //display();*/
        popAt(1);
        display();
    }
    public static void push(int val)
    {   Stack_Using_LinkedList st=al.get(al.size()-1);
        if( st.capacity() ==limit )
        {   al.add(new Stack_Using_LinkedList());
            st=al.get(al.size()-1);
        }
        st.push(val);
    }
    
    public static int pop()
    {   Stack_Using_LinkedList st=al.get(al.size()-1);
        int val=st.pop();    
        if( st.capacity() ==0 )
           al.remove(al.size()-1);
        return val;
    }
    
    public static int peek()
    {   Stack_Using_LinkedList st=al.get(al.size()-1);
        int val=st.peek();
        return val;
    }
    
    public static void display()
    {   for(int i=al.size()-1;i>=0;i--)
        {   al.get(i).display();
            //System.out.println(al.get(i).bottom.key);
        }
    }
    
    public static int popAt(int i)
    {   Stack_Using_LinkedList st=al.get(i);
        int val=st.pop();
        //System.out.println(val);
        if(i==(al.size()-1))
            return val;
        else
        {   if(st.capacity()==0)
                al.remove(i);
            else
                shift(i);
        }
        return val;
    }
    
    public static void shift(int i)
    {   Stack_Using_LinkedList st=al.get(i);
        st.push(al.get(i+1).bottom.key);
        i=i+1;
        st=al.get(i);
        st.recurse(st.top);
        st.pop();          
        if(i==al.size()-1)
            return;  
        shift(i);
    }   
}
