package pkg2.pkg4;

import java.util.Scanner;

public class LinkedList
{
    static Node start,end,temp;    
    Node nd;
    LinkedList()
    {   start=null;
        end=null;
    }
    
    public static Node createNode(int val)
    {   Node nd=new Node();
        nd.key=val;
        return nd;
    }
    
    public static void insertNode(int val)
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
    }
    
    public static void display(Node nd)
    {   while(nd!=null)
        {  System.out.print(nd.key+"-->");
            nd=nd.link;
        }
        System.out.println();
    }    
}