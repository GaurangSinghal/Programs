package pkg4.pkg3;

public class Main 
{
    public static void main(String[] args)
    {   Main m=new Main();
        int[] a={1,2,3,4,5,6,7,8,9};     
        Node n=m.create(a,0,8);
        System.out.println(n.key+" "+n.left.key+" "+n.right.key);
    }
    public Node create(int[]a,int strt,int end)
    {   if(strt>end)
            return null;
        if(strt==end)
            return new Node(a[strt]);
        int mid=(strt+end)/2;
        Node nd=new Node(a[mid]);
        nd.left=create(a,strt,mid-1);
        nd.right=create(a,mid+1,end);
        return nd;
    }
}
