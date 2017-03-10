
package binary.serach.tree;
import java.util.Scanner;

public class BinarySerachTree 
{
    static Node root,temp;
    
    public BinarySerachTree()
    {   root=null;
    }
    
    public static Node createNode(int val)
    {   Node nd=new Node();
        nd.key=val;
        return nd;
    }
    
    public static void store(Node nd,Node rt)
    {   if(rt.left==null && nd.key<rt.key)
        {   rt.left=nd;
            return;
        }
         if(rt.right==null && nd.key>rt.key)
        {   rt.right=nd;
            return;
        }
        if(nd.key<rt.key) 
           store(nd,rt.left);        
        else 
            store(nd,rt.right);
    }
    
    public static void insertNode(int val)
    {   Node nd=createNode(val);
        if(root==null)
           root=nd;        
        else
        {   Node rt=root;
            store(nd,rt);
        }
    }
    
    public static Node search(Node rt,int val)
    {   if(rt==null)
            return null;
        if(rt.key!=val)
        {   if(rt.key>val)
                return search(rt.left,val);
            else 
                return search(rt.right,val);            
        }
        return rt;
    }
    
    public static Node Max(Node n,int val) //to find parent of maxima in the left subtree of a node
    {   while(n.right.right!=null)
            n=n.right;
        return n;
    }
    
    public static void delete(int val)
    {   if(search(root,val)!=null)
            root=delete(root,val);
        display(root);
    }
    
    public static Node delete(Node n,int val)
    {   Node rt=null;
        if(n.key==val)
        {   if(n.left==null && n.right==null)
               return null;            
            else if(n.left==null)
            {   return n.right;
            }
            else if(n.right==null)
            {   return n.left;
            }
            else
            {   rt =Max(n.left,val);
                rt.right.right=n.right;
                return n.left;
            }            
        }
        else
        {   if(n.key<val)
                n.right=delete(n.right,val);
            else 
                n.left=delete(n.left,val);                          
        }
        return n;
    }    
    
    public static void display(Node nd)   //Inorder traversal......
    {   if(nd==null)
            return;
        else
        {   display(nd.left);
            System.out.print(nd.key+" ");
            display(nd.right);
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {   Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++)
        {   int val=sc.nextInt();
            insertNode(val);    
        }
        display(root);
        
        if(search(root,7)!=null)   //searching element with key '7'
            System.out.println("found");
        else
            System.out.println("not found");
        
        delete(7);
    }    
}
