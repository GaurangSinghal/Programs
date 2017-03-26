
package pkg1.pkg3;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int[] check=new int[128];
        if(s1.length()!=s2.length())
        {   System.out.println("false");
            System.exit(1);
        }
        int i,c=1;
        for(i=0;i<s1.length();i++)
        {   ++check[s1.charAt(i)];   
        }
        for(i=0;i<s2.length();i++)
        {   --check[s2.charAt(i)];   
            if(check[s2.charAt(i)]<0)
            {   System.out.println("false");
                c=0;
                break;
            }    
        }
        if(c==1)
            System.out.println("true");
    }
    
}
