package pkg2.pkg5;

public class Main 
{
    public static void main(String[] args)
    {   LinkedList lst1=new LinkedList();
        LinkedList lst2=new LinkedList();
        int i;
        Node N1=null,N2=null;
        for(i=4;i<=7;i++)
        {   N1=lst1.insertNode(9);
            N2=lst2.insertNode(8);
        }          
        //N2=lst2.insertNode(8);
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
    {   LinkedList lst3=new LinkedList();
        int sum=0,oh=0;
        Node rsl=null,start=null; 
        while(N1!=null && N2!=null)
        {   sum=N1.key+N2.key+oh;
            if(sum>=10)
               oh=1;   
            else
               oh=0;
            rsl=lst3.insertNode(sum%10);
            N1=N1.link;
            N2=N2.link;
        }
        while(N1!=null)
        {   sum=N1.key+oh;
            if(sum>=10)
                oh=1;
            else
                oh=0;
            rsl=lst3.insertNode(sum%10);
            N1=N1.link;
        }
        while(N2!=null)
        {   sum=N2.key+oh;
            if(sum>=10)
                oh=1;      
            else
                oh=0;            
            N2=N2.link;
            rsl=lst3.insertNode(sum%10);
        }
        if(oh==1)
            rsl=lst3.insertNode(1);
        return rsl;
    }
}
