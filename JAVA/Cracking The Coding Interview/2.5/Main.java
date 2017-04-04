package pkg2.pkg5;

public class Main 
{
    public static void main(String[] args)
    {   LinkedList lst1=new LinkedList();
        LinkedList lst2=new LinkedList();
        int i;
        Node N1=null,N2=null;
        for(i=4;i<=7;i++)
        {   N1=lst1.insertNode(i);
            N2=lst2.insertNode(i-3);
        }          
         N2=lst2.insertNode(8);
        display(N1);
        display(N2);
        Node N3=add(N1,N2);
        display(N3);
    }
    
    public static void display(Node nd)
    {   while(nd!=null)
        {  System.out.print(nd.key+"-->");
            nd=nd.link;
        }
        System.out.println();
    }  
    
    public static Node add(Node N1,Node N2)
    {   int sum=0,oh=0;
        Node rsl,start=null; 
        while(N1!=null && N2!=null)
        {   rsl=new Node();
            sum=N1.key+N2.key+oh;
            if(sum>=10)
            {   oh=1;
                rsl.key=sum%10;                
            }
            else
            {   oh=0;
                rsl.key=sum;
            }
            N1=N1.link;
            N2=N2.link;
            if(start==null)
                start=rsl;
            else
            {   rsl.link=start;
                start=rsl;
            }
        }
        while(N1!=null)
        {   sum=N1.key+oh;
            rsl=new Node();
            if(sum>=10)
            {   oh=1;
                rsl.key=sum%10;                
            }
            else
            {   oh=0;
                rsl.key=sum;
            }
            N1=N1.link;
            rsl.link=start;
            start=rsl;
        }
        while(N2!=null)
        {   sum=N2.key+oh;
            rsl=new Node();
            if(sum>=10)
            {   oh=1;
                rsl.key=sum%10;                
            }
            else
            {   oh=0;
                rsl.key=sum;
            }
            N2=N2.link;
            rsl.link=start;
            start=rsl;
        }
        return start;
    }
}
