package pkg4.pkg4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main 
{   ArrayList<LinkedList> al=new ArrayList<>();
    public static void main(String[] args) 
    {   Main m=new Main();
        //System.out.println(cnt);
        m.nlink(null,0);
        //System.out.println(cnt);
    }
    
    public void nlink(Node nd,int cnt)
    {   if(nd==null)
            return;         
        if(al.size()-1 < cnt)
            al.add(new LinkedList());
        al.get(cnt).add(nd);
        nlink(nd.left,cnt+1);
        nlink(nd.right,cnt+1);
    }
}
