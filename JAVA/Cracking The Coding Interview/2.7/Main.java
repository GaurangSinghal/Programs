package pkg2.pkg7;

import java.util.Stack;

public class Main 
{
    public static void main(String[] args) 
    {   LinkedList lst=new LinkedList();
        LinkedList lst1=new LinkedList();
        Node N=null,N1=null,temp=null;
        int i,c=0;
        for(i=7;i<=11;i++)
            N=lst.insertNode(i,N);
        for(i=10;i>=7;i--)
            N=lst.insertNode(i,N);
        /*display(N);
        if(alternate(N))                           //1st method using STACK class
            System.out.println("true");
        else
            System.out.println("false");        */
                                                   //2nd method by matching reverse of list with the original                         
        temp=N;        
        while(N!=null)         //storing the reverse of N in N1
        {   N1=lst1.insertNode(N.key,N1);
            N=N.link;
        }
        N=temp;
        display(N);
        display(N1);
        while(N.link!=null)      //checking whether N==N1 ?
        {   if(N.key!=N1.key)
            {   c=1;
                break;
            }
            N=N.link;
            N1=N1.link;
        }
        if(c==0)
            System.out.println("true");
        else
            System.out.println("false");
        //
        //middle=middle.link;
        //display(middle);       
    }
    
    public static void display(Node nd)
    {   while(nd!=null)
        {  System.out.print(nd.key+"-->");
            nd=nd.link;
        }
        System.out.println();
    }  
    
    public static boolean alternate(Node N)           // 1st method using STACK class
    {   Stack st=new Stack();
        Node middle=getmiddle(N);
        int len=findlength(N);       
        middle=middle.link;
        System.out.println(len);
        System.out.println(middle.key);
        while(middle!=null)
        {   st.push(middle.key);
            middle=middle.link;
        }
        len=len/2;
        while(len!=0)
        {   if((Integer)st.pop()!=N.key)
                return false;
            N=N.link;    
            len=len-1;
        }
        return true;
    }
    
    public static int findlength(Node N)
    {   int c=0;
        while(N!=null)
        {++c;
        N=N.link;}
        return c;
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
}
