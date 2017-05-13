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
}
