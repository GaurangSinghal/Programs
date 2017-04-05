package pkg3.pkg1;

public class Main 
{
    int[] st=new int[30]; //3 stacks of size 10 each in a size(30) array
    int[] pt={-1,-1,-1}; //for storing top index of each stack
    
    public static void main(String[] args)
    {   Main obj=new Main();
        for(int i=5;i<9;i++)
            obj.push(0, i);
        for(int i=15;i<19;i++)
            obj.push(1, i);
        for(int i=25;i<29;i++)
            obj.push(2, i);
        obj.display();
        System.out.println(obj.pop(0));
        System.out.println(obj.pop(1));
        System.out.println(obj.pop(2));
        obj.display();
    }    
    
    public void push(int SN,int val)
    {   ++pt[SN];
        int i=SN*10+pt[SN];
        st[i]=val;
    }
    
    public int pop(int SN)
    {   int i=SN*10+pt[SN];
        int val=st[i];
        --pt[SN];
        return val;
    }
    
    public void display()
    {   int j;
        for(int i=0;i<3;i++)
        {   for(j=i*10;j<=i*10+pt[i];j++)
                System.out.print(st[j]+" ");
            System.out.println();    
        }
    }
}
