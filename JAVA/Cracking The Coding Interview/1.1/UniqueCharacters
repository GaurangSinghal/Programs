package unique.characters;

import java.util.Scanner;

public class UniqueCharacters 
{
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in); 
        String s=sc.nextLine();
        int c=1;
        if(s.length()>128)
        {   System.out.println("False");
            System.exit(1);
        }
        boolean[] b=new boolean[128];
        for(int i=0;i<s.length();i++)
        {   int val=s.charAt(i);
            if(b[val])
            {   System.out.println("false");
                c=0;
                break;
            }
            b[val]=true;
        }
        if(c==1)
        {   System.out.println("true");}
    }    
}
