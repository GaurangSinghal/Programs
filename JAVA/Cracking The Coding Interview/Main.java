package pkg1.pkg4;

public class Main
{
    public static void change(String s,int l)
    {   int len=s.length();         
        char[] c=s.toCharArray();
        char[] d=new char[len];
        int i=0,j=0,k=0;                
        while(c[i]==' ')
            ++i;        
        for(j=i;j<l;j++)
        {   if(c[j]==' ')
            {   d[k++]='%';
                d[k++]='2';
                d[k++]='0';
            }
            else
            {   d[k++]=c[j];
            }
        }
        System.out.println(d);
    }
    public static void main(String[] args) 
    {   String s="Mr John Smith            ";
        int len=13;
        change(s,len);
        /*char[] ch=s.toCharArray();
        System.out.println(ch);*/
    }    
}
