#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	int i,j,t,sum=0,p,n,m,c=0,a[100];
	double k,q,r;
	cin>>t;
	for(i=0;i<t;i++)
	{
		cin>>n;
		k=pow(2,n-1);
		q=pow(2,n-2);
		r=pow(2,n-3);
		for(j=0;j<n;j++)
		{
			cin>>a[j];
			sum=sum+(a[j]*k);
		}
		for(j=0;j<n;j++)
		{
			c=0;
			for(p=0;p<n;p++)
			{
				if(a[p]==a[j])
				{
					++c;
					m=a[p];
				}
			}
			if(c>1)
			{
				sum=sum-((k-q)*m);
				for(p=0;p<n;p++)
				{
					if(a[p]==m)
					continue;
					sum=sum-((q-r)*a[p]);
				}
			}
		}
		cout<<sum<<endl;
	}
	return 0;
}
