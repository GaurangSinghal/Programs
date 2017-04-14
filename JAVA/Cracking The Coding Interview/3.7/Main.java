package pkg3.pkg7;

import java.util.LinkedList;

public class Main 
{   //LinkedList<String> animal=new LinkedList();
    LinkedList<String> cat=new LinkedList();
    LinkedList<String> dog=new LinkedList();
    LinkedList<String> typ=new LinkedList();
    
    public static void main(String[] args) 
    {   Main m=new Main();
        m.enqueue("cat","kitty");
        m.enqueue("dog","pup");
        m.enqueue("cat","kitty1");
        m.enqueue("dog","kitty");
        m.enqueue("cat","kitty2");
        //System.out.println(m.animal);
        System.out.println(m.cat);
        System.out.println(m.dog);
        System.out.println(m.typ);
        System.out.println(m.dequeDog());
        System.out.println(m.dequeDog());
        //System.out.println(m.animal);
        System.out.println(m.cat);
        System.out.println(m.dog);
        System.out.println(m.typ);
    }    
    
    public void enqueue(String type, String s) 
    {   //animal.add(s);
        if(type=="cat")
        {   cat.add(s);
            typ.add("cat");
        }
        if(type=="dog")
        {   dog.add(s);
            typ.add("dog");
        }        
    }
    
    public String dequeAny()
    {   if(typ.peek()=="cat")
        {   typ.remove();
            return cat.remove();
        }
        typ.remove();
        return dog.remove();
    }   
    
    public String dequeDog()
    {   int ind=typ.indexOf("dog");
        //animal.remove(ind);
        typ.remove(ind);
        return dog.remove();    
    }    
    
    public String dequeCat()
    {   int ind=typ.indexOf("cat");
        //animal.remove(ind);
        typ.remove(ind);
        return cat.remove();
    }    
}
