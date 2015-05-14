//1 st method
#include<iostream>
using namespace std;
int main()
{
	int m,n,i,c,d,maxm;
	cin>>m>>n;
	c=max(m,n);
	d=min(m,n);
	for(i=d;i>=1;)
	{
		if(c%i==0&&d%i==0)
		{
			maxm=i;
			break;
		}
		if(i>2)
		{i=i-1;
		}
		else
		{maxm=1;
	
	break;}
	}
	cout<<maxm;
	return 0;
}
//2nd method (euclid's method)
/*#include<iostream>
using namespace std;
int main()
{
	int m,n,i,c,d;
	cin>>c>>d;
//	c=max(m,n);
//	d=min(m,n);
	while(c%d!=0)
	{
		i=c%d;
		c=d;
		d=i;
	}
	
	cout<<d;
	return 0;
}*/
