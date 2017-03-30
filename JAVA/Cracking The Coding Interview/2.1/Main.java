package pkg2.pkg1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main 
{
    public static void removeDuplicate(LinkedList<Integer> lst)
    {   HashSet<Integer> hs=new HashSet<>();
        int val;
        Iterator i=lst.iterator();
        //val=i.next();
        //System.out.println(val);
        while(i.hasNext())
        {   val=(Integer)i.next();
            if(hs.contains(val))
                i.remove();      // cannot use lst.remove() as it will result in ConcurrentModificationException
                                 // this is because Java Collection classes are fail fast
            else
                hs.add(val);
        }
    }
    
    public static void main(String[] args) 
    {   LinkedList<Integer> lst=new LinkedList<>(Arrays.asList(2,2,3,4,5,6,3,6,3,5,5)); //this creates a fixed size arraylist backed by an array
        removeDuplicate(lst);
        System.out.println(lst);
    }    
}
