package depth.first.search;

import java.util.LinkedList;

public class DepthFirstSearch 
{   LinkedList<LinkedList> ls= new LinkedList<>();
    boolean visited [] = new boolean[9];
    public static void main(String[] args) 
    {   DepthFirstSearch d=new DepthFirstSearch();
        LinkedList<Integer> adj;
        for(int i=0;i<9;i++)
        {   adj=new LinkedList<Integer>();
            d.ls.add(adj);
        }        
        d.add(1,2);
        d.add(1,7);
        d.add(1,6);
        d.add(2,3);
        d.add(2,7);
        d.add(7,8);
        d.add(6,8);
        d.add(6,5);
        d.add(8,5);
        d.add(8,4);
        d.add(3,4);
        d.add(4,5);
        
        d.search(1);
    }    
    
    public void add(int n1,int n2)
    {   ls.get(n1).add(n2);      
    }
    
    public void search(int rt)
    {   visited[rt]=true;
        int n;
        System.out.println(rt);
        for(int i=0;i<ls.get(rt).size();i++)
        {   n=(int) ls.get(rt).get(i);
            if(!visited[n])
            {   search(n);
            }
        }
    }
}
