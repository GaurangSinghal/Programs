package cycle.detection.in.undirected.graph;

import java.util.HashMap;
import java.util.LinkedList;

public class CycleDetectionInUndirectedGraph 
{   
    LinkedList<LinkedList> ls= new LinkedList<>();
    boolean visited [] = new boolean[9];
    int flag=0;
    
    public static void main(String[] args) 
    {   CycleDetectionInUndirectedGraph d=new CycleDetectionInUndirectedGraph();
        LinkedList<Integer> adj;
        for(int i=0;i<9;i++)
        {   adj=new LinkedList<Integer>();
            d.ls.add(adj);
        }        
        d.add(1,2);
        //d.add(2,1);
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
        
        d.search(1,-1);
        if(d.flag==0)
            System.out.println("no cycle");
    }    
    
    public void add(int n1,int n2)
    {   ls.get(n1).add(n2);
        ls.get(n2).add(n1);
    }
    
    public void search(int rt, int parent)           // HashMap to store nodes which are gray, i.e. those nodes which  
    {   visited[rt]=true;                            // are stored in stack during recursion. If gray nodes are revisited 
                                                     // that means there is cycle.
        int n;
        for(int i=0;i<ls.get(rt).size();i++)
        {   if(flag==1)
                break;
            n=(int) ls.get(rt).get(i);
            
            if(!visited[n])
            {   search(n,rt);
            }
            
            else if(parent!=n)
            {   System.out.println("cycle "+rt+" "+n);
                flag=1;
                break;
            }            
        }       
    }
}


