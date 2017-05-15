package pkg9.pkg2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main 
{   static ArrayList<ArrayList<Point>> al=new ArrayList<>();    // used in all_paths method
    static ArrayList<Point> pth=new ArrayList<>();              //  used in all_paths method
    static HashMap<Point,Boolean> hm=new HashMap<>(); // used in alternatePath method
    static HashMap<Point,Integer> m=new HashMap<>();   // used in no_of_paths method
    int flag=0;
    
    public static void main(String[] args)
    {   Main nm=new Main();
        System.out.println(nm.no_of_paths(2,2));   
        nm.all_paths(2,2);
        for(int i=0;i<al.size();i++)
        {   for(int j=0;j<al.get(i).size();j++)
            {   System.out.print(al.get(i).get(j).x+","+al.get(i).get(j).y+" ");
            }
            System.out.println();  
        }  
        nm.alternatePath(2,2,new ArrayList<Point>());        
        
        for (HashMap.Entry<Point, Boolean> item : nm.hm.entrySet()) 
        {
            Point key = item.getKey();
            boolean value = item.getValue();
            System.out.println(key.x+","+key.y+" ----> "+ value);
        }


    }    
    
    public int no_of_paths(int x, int y)                // to find total no. of paths
    {   if(x<0 || y<0)
            return 0;
        if(x==0 || y==0)
            return 1;
        Point p=new Point(x,y);
        if(m.containsKey(p))
            return (int) m.get(p);
        int n= no_of_paths(x-1,y)+no_of_paths(x,y-1);
        m.put(p, n);        
        return n;
    }
    
    public void all_paths(int x, int y)            // to find and store 'all' possible paths
    {   if(x<0 || y<0)
            return ;
    
        Point p=new Point(x,y);         
        pth.add(p);
        
        if(x==0 && y==0)
        {   ArrayList py=(ArrayList) pth.clone();
            al.add(py);
            pth.remove(pth.size()-1);
            return;
        }
        all_paths(x-1,y);       
        all_paths(x,y-1);   
        pth.remove(pth.size()-1);      
    }
    
    public void path(int x, int y,ArrayList<Point> pt)            // to find 'a' path 
    {   if(x<0 || y<0)
            return ;
    
        Point p=new Point(x,y);         
        pt.add(p);
        
        if(x==0 && y==0)
        {   flag=1;
            display(pt);
            return;
        }
        if(x>0)
            path(x-1,y,pt);
        if(flag==1)
            return;
        if(y>0)
            path(x,y-1,pt);
    }
    
    public boolean alternatePath(int x, int y,ArrayList<Point> pt)            // to find 'a' path using Memoization
    {   if(x<0 || y<0)
            return false;
    
        Point p=new Point(x,y);         
        pt.add(p);
        if(hm.containsKey(p))
            return hm.get(p);
        if(x==0 && y==0)
        {   flag=1;
            display(pt);
            return true;
        }
        if(alternatePath(x-1,y,pt))
            hm.put(p,true);
        if(flag==1)
            return true;
        if(alternatePath(x,y-1,pt))
        {   hm.put(p,true);
            return true;
        }
        else
        {    hm.put(p,false);        
             return false; 
        }
    }
    
    public void display(ArrayList<Point> pt)
    {   for(int i=0;i<pt.size();i++)
        {   System.out.print(pt.get(i).x+","+pt.get(i).y+"  ");        
        } 
        System.out.println();
    }
    
}
