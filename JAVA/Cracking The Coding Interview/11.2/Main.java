package pkg11.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main 
{   HashMap<String,ArrayList<String>> hm=new HashMap<>();
    public static void main(String[] args)
    {   Main m=new Main();
        String[] s={"care","love","race","my","ear","hello","are"};
        m.anagrams(s);
    }
    
    public void anagrams(String[] s)
    {   char[] ch;
        String str;
        display(s);
        for(int i=0;i<s.length;i++)
        {   ch=s[i].toCharArray();
            Arrays.sort(ch);
            str=new String(ch);
            if(!hm.containsKey(str))                
              hm.put(str, new ArrayList<String>());
            hm.get(str).add(s[i]);    
        }
        int i=0;
        for(String key:hm.keySet())
        {   ArrayList<String> al=hm.get(key);
            for(String val:al)
            {   s[i++]=val;
            }
        }
        display(s);
    }
    
    public void display(String[] s)
    {   for(String str:s)
            System.out.print(str+" ");
        System.out.println();    
    }    
}
