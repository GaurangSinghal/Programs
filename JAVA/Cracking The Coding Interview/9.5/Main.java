package pkg9.pkg5;

import java.util.ArrayList;

public class Main 
{   
    public static void main(String[] args) 
    {   Main m=new Main();
        String s="gau";
        System.out.println(m.stringPermute(s));
    }    
    
    public ArrayList<String> stringPermute(String s)
    {   int i;        
        ArrayList<String> p=new ArrayList<String>();    
        
        if(s.length()==0)
        {   p.add(""); 
            return p;
        }
        char ch=s.charAt(0);
        ArrayList<String> al=stringPermute(s.substring(1));
        for(String str:al)
        {   for(i=0;i<=str.length();i++)
            {   p.add(insert(ch,i,str));
            }
        }        
        return p;
    }
    
    public String insert(char ch,int i,String str)
    {   String s1= str.substring(0,i);
        String s2= str.substring(i);
        return s1+ch+s2;
    }
}
