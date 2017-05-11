package pkg4.pkg1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main 
{
    static Node root,temp;  
    /*static Queue<Node> q=new LinkedList<>();
    
    public static Node createNode(int val)
    {   Node nd=new Node();
        nd.key=val;
        return nd;
    }
    
    public static void store(Node nd,Node rt)
    {   if(rt.left==null)
        {   rt.left=nd;
            return;
        }
        else if(rt.right==null)
        {   rt.right=nd;
            return;
        }
        else 
            store(nd,rt.left);
    }
    
    public static void insertNode(int val)
    {   Node nd=createNode(val);
        if(root==null)
        {   root=nd;
            
        }        
        else
        {   if(q.peek().left==null)
                q.peek().left=nd;
            else
            {   q.peek().right=nd;
                q.poll();
            }
        }
        q.add(nd);
    }*/
    public static void main(String[] args)
    {   /*Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++)
        {   int val=sc.nextInt();
            insertNode(val);    
        }*/
        //display(root);
        if(height(root)==-1)
            System.out.println("not balanced");
        else
            System.out.println("balanced");
    }     
    /*
    public static void display(Node nd)   //Inorder traversal......
    {   if(nd==null)
            return;
        else
        {   display(nd.left);
            System.out.print(nd.key+" ");
            display(nd.right);
        }
    }*/
    
    public static int height(Node nd)
    {   if(nd==null)
            return 0;
        int h1=height(nd.left);
        if(h1==-1)
            return -1;
        int h2=height(nd.right);
        if(h1==-1)
            return -1;
        if(Math.abs(h1-h2)>1)
           return -1;
        else
            return 1+Math.max(h1, h2);
    }
}
