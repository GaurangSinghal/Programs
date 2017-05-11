package breadth.first.search;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class BreadthFirstSearch
{   LinkedList<LinkedList> ls= new LinkedList<>();
    boolean visited [] = new boolean[9];
    LinkedList q=new LinkedList();
    
    public static void main(String[] args) 
    {   BreadthFirstSearch d=new BreadthFirstSearch();
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
        //System.out.println(d.ls.get(8));
        d.search(1);
    }    
    
    public void add(int n1,int n2)
    {   ls.get(n1).add(n2);      
    }
    
    public void search(int rt)
    {   q.add(rt);
        visited[rt]=true;
        int n,no;        
        while(q.peek()!=null)
        {   n=(int) q.poll();
            System.out.println(n);
            for(int i=0;i<ls.get(n).size();i++)
            {   no=(int) ls.get(n).get(i);
                if(!visited[no])
                {   visited[no]=true;
                    q.add(no);
                }
            }
        }
        
    }
}