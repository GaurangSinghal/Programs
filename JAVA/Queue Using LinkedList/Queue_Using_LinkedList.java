package queue_using_linkedlist;

public class Queue_Using_LinkedList 
{   
    Node head=null,tail=null;
    public static void main(String[] args) 
    {   Queue_Using_LinkedList q=new Queue_Using_LinkedList();
        for(int i=0;i<6;i++)
            q.enqueue(i);
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(10);
        q.enqueue(11);
        q.dequeue();
        q.display();
    }
    
    public void enqueue(int val)
    {   Node n=new Node(val);
        if(head==null)
        {   head=n;    
            tail=n;
        }
        else
        {   tail.link=n;
            tail=tail.link;
        }
    }
    
    public int dequeue()
    {   if(head==null)
            return -1;
        int val=head.key;
        head=head.link;
        return val;
    }
    public void display()
    {   Node n=head;
        while(n!=null)
        {   System.out.print(n.key);
            n=n.link;
        }
        System.out.println();
    }
}
