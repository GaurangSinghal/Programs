package pkg9.pkg4;

import java.util.ArrayList;

public class Main
{
    ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) 
    {   Main m=new Main();
        ArrayList<Integer> set=new ArrayList<>();
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        System.out.println(m.subset(set,set.size()-1));
        //m.alternate_subset(set,set.size()-1);
        //System.out.println(m.al);
    }    
    
    public ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> set, int n) // n = size(of set)-1
    {   if(n<0)
        {   al.add(new ArrayList<Integer>());
            return al;
        }
        al=subset(set,n-1);
        ArrayList<ArrayList<Integer>> cl=new ArrayList<ArrayList<Integer>>();
        int item=set.get(n);
        for(ArrayList<Integer> st: al)
        {   ArrayList<Integer> newset=new ArrayList<>();
            newset.addAll(st);
            newset.add(item);
            cl.add(newset);                    
        }
        al.addAll(cl);
        return al;
    }
    
    public void alternate_subset(ArrayList<Integer> set, int n)  // n=size(of set)-1
    {   al.add(new ArrayList<Integer>());
        int item; 
        for(int i=0;i<=n;i++)
        {   item=set.get(i);
            ArrayList<ArrayList<Integer>> cl=new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> subset:al)
            {   ArrayList<Integer> temp= new ArrayList<Integer>();
                temp.addAll(subset);
                temp.add(item);
                cl.add(temp);
            }
            al.addAll(cl);
        }
    }
}
