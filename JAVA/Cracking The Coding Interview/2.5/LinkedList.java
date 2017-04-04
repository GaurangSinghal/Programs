package pkg2.pkg5;

import java.util.Scanner;

public class LinkedList
{
    Node start,end,temp;    
    Node nd;
    LinkedList()
    {   start=null;
        end=null;
    }
    
    public Node createNode(int val)
    {   Node nd=new Node();
        nd.key=val;
        return nd;
    }
    
    public Node insertNode(int val)
    {   Node nd=createNode(val);        
        if(start==null)
        {   start=nd;
            end=nd;            
        }
        else
        {   temp=start;
            start=nd;
            start.link=temp;            
        }
        return start;
    }      
}