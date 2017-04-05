package pkg2.pkg7;

import java.util.Scanner;

public class LinkedList
{
    /*Node start,end,temp;    
    Node nd;
    LinkedList()
    {   start=null;
        end=null;
    }*/
    Node temp;
    public Node reverse(Node N)
    {   Node temp=null;
        Node fl= null;
        while(N!=null)
        {   fl=N;
            N=N.link;
            fl.link=temp;
            temp=fl;
        }
        return fl;
    }
    
    public Node createNode(int val)
    {   Node nd=new Node();
        nd.key=val;
        return nd;
    }
    
    public Node insertNode(int val,Node start)
    {   Node nd=createNode(val);        
        if(start==null)
        {   start=nd;
            //end=nd;            
        }
        else
        {   temp=start;
            start=nd;
            start.link=temp;            
        }
        return start;
    }      
}