package pkg9.pkg2;

public class Point 
{   int x;
    int y;
    public Point(int a, int b)
    {   x=a;
        y=b;
    }
    
    @Override
    public int hashCode() {
        int hash = x/2+y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {   if(this==obj)
            return true;
        if (obj == null) 
            return false;        
        if (getClass() != obj.getClass()) 
            return false;
        
        final Point other = (Point) obj;
        if(x==other.x && y==other.y)
            return true;
        return false;
    }
}
