package pkg4.pkg2;

import java.util.LinkedList;

public class Main
{   LinkedList<LinkedList> ls=new LinkedList<>();
    boolean[] visit=new boolean[9];    

    public boolean search(int n1, int n2)
    {   if(n1==n2)
            return true;
        int no;
        for(int i=0;i<ls.get(n1).size();i++)
        {   no=(int) ls.get(n1).get(i);
            if(!visit[no])
            {   visit[no]=true;
                search((int) ls.get(n1).get(i),n1);
            }
        }    
        return false;
    }
}
