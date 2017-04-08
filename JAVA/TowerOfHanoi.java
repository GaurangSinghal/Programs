package towerofhanoi;

public class TowerOfHanoi
{
    public static void main(String[] args) 
    {   TOH(1,2,3,5);       
    }
    
    public static void TOH(int start,int middle,int end,int n)
    {   if(n==1)
        {  System.out.println("Move "+n+" from disk "+start+" to disk "+end);
        return;}
       
        TOH(start,end,middle,n-1);
        System.out.println("Move "+n+" from disk "+start+" to disk "+end);
        TOH(middle,start,end,n-1);
    }
}
