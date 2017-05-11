package pkg4.pkg9;

import java.util.ArrayList;

public class Main
{   ArrayList<ArrayList> al=new ArrayList<>(); 
    ArrayList path=new ArrayList();
    public void find(Node nd, int sum)
    {   if(nd==null)
            return;
        path.add(nd.key);
        int val=sum;
        for(int i=path.size();i>=0;i--)
        {   val=val-(int)path.get(i);
            if(val==0)
                al.add(path);
        }
        find(nd.left,sum);
        find(nd.right,sum);  
        path.remove(path.size()-1);
    }
   
}
