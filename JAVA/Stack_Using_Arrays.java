// .....................Java program which implements Stack using Array.....................................//

package stack_using_arrays;

public class Stack_Using_Arrays 
{
    int[] st=new int[10];
    int top=-1;
    public static void main(String[] args)
    {   Stack_Using_Arrays obj=new Stack_Using_Arrays();
        for(int i=6;i<15;i++)   
            obj.push(i);
        obj.display();    
        int val=obj.pop();
        System.out.println(val);        
        obj.display();
    }    
    
    public void display()
    {   int i=0;
        while(i<=top)
            System.out.print(st[i++]+"  ");
        System.out.println();
    }
    
    public int peek()
    {   return st[top];
    }
    
    public void push(int val)
    {   st[++top]=val;
    }
    
    public int pop()
    {   return st[top--];
    }
}
