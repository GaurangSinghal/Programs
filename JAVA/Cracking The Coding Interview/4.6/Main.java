package pkg4.pkg6;

public class Main
{
    public Node successor(Node nd)
    {   if(nd.right!=null)
            return left(nd.right);
        else
        {   if(nd.key<nd.parent.key)
                return nd.parent;
            else
            {   while(nd.parent.left!=nd)
                   nd=nd.parent;
                return nd.parent;   
            }    
        }
    }
    
    public Node left(Node nd)
    {   while(nd!=null)
            nd=nd.left;
        return nd;
    }
}
