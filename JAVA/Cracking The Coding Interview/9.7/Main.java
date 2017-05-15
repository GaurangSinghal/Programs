package pkg9.pkg7;

enum Color
{   red, black,yellow
}

public class Main
{
    public static void main(String[] args)
    { 
    } 
    
    public void fill(Color[][] g,int x, int y,Color ocol, Color ncol)
    {   if(x<0 || y<0 || x>=g.length || y>=g[0].length)
            return;
        if(g[x][y]==ocol)
        {   g[x][y]=ncol;
            fill(g,x-1,y,ocol,ncol);
            fill(g,x,y-1,ocol,ncol);
            fill(g,x+1,y,ocol,ncol);
            fill(g,x,y+1,ocol,ncol);     
        }
    }
}
