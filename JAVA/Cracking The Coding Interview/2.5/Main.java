package pkg2.pkg5;

public class Main 
{
    static int oh=0; // to store the carry
    static Node hs=null;
    static LinkedList lst3=new LinkedList();
    public static void main(String[] args)
    {   LinkedList lst1=new LinkedList();
        LinkedList lst2=new LinkedList();
        int i;
        Node N1=null,N2=null;
        for(i=7;i<=9;i++)
        {   N1=lst1.insertNode(i);
            N2=lst2.insertNode(i);
        }          
        //N2=lst2.insertNode(8);
        display(N1);
        display(N2);       
        //hs=add(N1,N2); // if list stores the digits in reverse order
        alternate(N1,N2); // if list stores the digits in original order
        display(hs);
    }
    
    public static void display(Node nd)
    {   while(nd!=null)
        {  System.out.print(nd.key+"-->");
            nd=nd.link;
        }
        System.out.println();
    }  
    
    public static Node add(Node N1,Node N2)   // if list stores the no. in reverse order
    {   int sum=0;
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
    
    public static void alternate(Node N1, Node N2)         //if list stores the no. in same order
    {   int len1=length(N1);
        int len2=length(N2);
        int len=len1-len2;
        if(len>0)
            pad(N2,len);
        if(len<0)
            pad(N1,-len);
        add_alternate(N1,N2);
        if(oh==1)
            hs=lst3.insertNode(oh);
    }
    
    public static void add_alternate(Node N1,Node N2)
    {   if(N1==null)
            return ;
        //N1=N1.link;
       // N2=N2.link;
        add_alternate(N1.link,N2.link);
        if(N1!=null && N2!=null)
        {   int sum=oh+N1.key+N2.key;
            oh=(sum>=10)?1:0;
            hs=lst3.insertNode(sum%10);           
        }        
    }
    
    public static void pad(Node N,int l) // to add zeroes to the smaller number
    {   Node temp=null;        
        while(l--!=0)
        {   temp.key=0;
            temp.link=N;
            N=temp;
        }        
    }
    
    public static int length(Node N)
    {   int c=0;
        while(N!=null)
        {    c++;
            N=N.link;
        }
        return c;    
    }
}
