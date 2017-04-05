
package linked.list;

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
    
    public static Node reverse(Node N)
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
    
    public static void display(Node nd)
    {   while(nd!=null)
        {  System.out.print(nd.key+"-->");
            nd=nd.link;
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {   Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {   int val=sc.nextInt();
            insertNode(val);    
        }
        display(start);
        display(reverse(start));
    }    
}
