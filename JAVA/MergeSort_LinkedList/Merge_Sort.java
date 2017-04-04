package merge_sort;

import static merge_sort.LinkedList.start;

public class Merge_Sort
{
    public static Node msort(Node head)
    {   if(head==null || head.link==null )
            return head;
        Node middle=getmiddle(head);        
        Node nextmiddle=middle.link;
        middle.link=null;        
        Node left=msort(head);
        Node right=msort(nextmiddle);
        Node merged=merge(left,right);
        return merged;
    }
    public static Node merge(Node left,Node right)
    {   Node temp=null;
        if(left==null)
            return right;
        if(right==null)
            return left;
        if(left.key<=right.key)
        {   temp=left;
            temp.link=merge(left.link,right);
        }
        if(left.key>right.key)
        {   temp=right;
            temp.link=merge(left,right.link);            
        }
        return temp;
    }
    
    public static Node getmiddle(Node head)
    {   Node temp1=head;
        Node temp2=head;
        while(temp1!=null && temp1.link!=null && temp1.link.link!=null)
        {   temp1=temp1.link.link;
            temp2=temp2.link;
        }
        return temp2;
    }
    
    public static void main(String[] args)
    {   LinkedList lst=new LinkedList();
        int i;        
        for(i=15;i<=18;i++)
            lst.insertNode(i);     
        //lst.insertNode(2);
        lst.display(start);
        start=msort(start);
        lst.display(start);
    }    
}
