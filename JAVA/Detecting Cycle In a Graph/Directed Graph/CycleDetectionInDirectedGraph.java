package cycle.detection.in.directed.graph;
import java.util.HashMap;
import java.util.LinkedList;

public class CycleDetectionInDirectedGraph
{   
    LinkedList<LinkedList> ls= new LinkedList<>();
    boolean visited [] = new boolean[9];
    int flag=0;
    
    public static void main(String[] args) 
    {   CycleDetectionInDirectedGraph d=new CycleDetectionInDirectedGraph();
        LinkedList<Integer> adj;
        for(int i=0;i<9;i++)
        {   adj=new LinkedList<Integer>();
            d.ls.add(adj);
        }        
          d.add(1,2);
        //d.add(1,7);
        //d.add(4,3);
        d.add(6,8);
        d.add(1,6);
        d.add(2,3);
        d.add(7,8);
        d.add(6,5);
        //d.add(4,3);
        //d.add(4,3);
        d.add(4,8);
        
        d.search(1,new HashMap<Integer,Boolean>());
        if(d.flag==0)
            System.out.println("no cycle");
    }    
    
    public void add(int n1,int n2)
    {   ls.get(n1).add(n2);      
    }
    
    public void search(int rt, HashMap<Integer,Boolean> al)          // HashMap to store nodes which are gray, i.e. those nodes which  
    {   visited[rt]=true;                                            // are stored in stack during recursion. If gray nodes are revisited 
        al.put(rt,true);                                             // that means there is cycle.
        int n;
        //System.out.println(rt);
        for(int i=0;i<ls.get(rt).size();i++)
        {   if(flag==1)
                break;
            n=(int) ls.get(rt).get(i);
            if(al.containsKey(n))
            {   System.out.println("cycle");
                flag=1;
                break;
            }
            if(!visited[n])
            {   search(n,al);
            }
            
        }
        al.remove(rt);
    }
}

