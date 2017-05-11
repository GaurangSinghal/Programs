package pkg4.pkg7;

public class Main 
{    
    public Node ancestor(Node nd, Node n1, Node n2)
    {   if(nd==null)
            return null;
        if(n1==n2)
            return n1;                                 
        if(check(n1,n2))                          //    ---  
            return n1;                            //      |       OR we can write ---->    if(nd==n1||nd==n2) return nd;
        else if(check(n2,n1))                     //      |
            return n2;                            //    ---
        
            else if(check(nd.left,n1)==check(nd.right,n2)) 
            return nd;   
        else
        {   return check(nd.left,n1)?ancestor(nd.left,n1,n2):ancestor(nd.right,n1,n2);
        }
    }
    
    public boolean check(Node nd, Node n)
    {   if(nd==null)
            return false;
        if(nd==n)
            return true;
        if(check(nd.left,n)|| check(nd.right,n))
            return true;
        return false;        
    }
    
    public Node alternate(Node nd, Node n1, Node n2)
    {   if(nd==null)
            return null;
        if(n1==n2)
            return n1;
        Node x=alternate(nd.left,n1,n2);
        if(x!=null && x!=n1 && x!=n2)
            return x;
        Node y=alternate(nd.right,n1,n2);
        if(y!=null && y!=n1 && y!=n2)
            return y;
        
        if(nd==n1 || nd==n2)
            return nd;
        if(x!=null && y!=null)
            return nd;
        else if(x==null && y!=null)
            return y;
        else if(y==null && x!=null)
            return x;
        else
            return null;
    }
}
