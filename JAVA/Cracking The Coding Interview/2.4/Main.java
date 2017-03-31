package pkg2.pkg4;

import java.util.Scanner;
import static pkg2.pkg4.LinkedList.start;

public class Main 
{
    public static void main(String[] args) 
    {   LinkedList lst=new LinkedList();
        int i;        
        for(i=1;i<10;i++)
            lst.insertNode(i+5);     
        lst.insertNode(2);
        lst.display(start);
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        partition(lst,val);
        lst.display(start);
    }   
   
    public static void partition(LinkedList lst,int val)
    {   Node temp=null;
        Node chk = start;
        Node cnt = start;
        while(chk.key<=val)
        {   cnt=chk;
            chk=chk.link;
        }
        while(chk.link!=null)
        {   if(chk.link.key<=val)
            {   temp=chk.link.link;
                chk.link.link=cnt.link;
                cnt.link=chk.link;
                chk.link=temp;               
            }
            else
                chk=chk.link;
        }
        start=cnt;
    }           
}

