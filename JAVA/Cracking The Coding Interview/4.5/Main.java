package pkg4.pkg5;

public class Main 
{ 
    public boolean isBST(Node nd)
    {   if(nd==null)
            return true;
        boolean h1=isBST(nd.left);
        boolean h2=isBST(nd.right);
        
        if(h1 && h2)
        {   if(nd.left==null && nd.right==null)
                return true;
            else if(nd.left==null && nd.left.key<=nd.key)
                return true;
            else if(nd.right==null && nd.right.key>nd.key)
                return true;
            else if(nd.right.key>nd.key && nd.left.key<=nd.key)
                return true;
            else 
                return false;        
        }
        return false;
    }
}
