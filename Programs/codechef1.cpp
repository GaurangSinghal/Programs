#include<iostream>
using namespace std;
int main()
{
	int t,n,m,j,i,max,rem,a[100],flag =0;
	cin>>t;
	for(i=0;i<t;i++)
	{
		rem=0;
		max=0;
		flag=0;
		cin>>n>>m;
		for(j=0;j<n;j++)
		{
			cin>>a[j];
			if(a[j]>max)
			max=a[j];
		}
		for(j=0;j<n;j++)
		{
			if(a[j]!=max)
			{
				rem=max-a[j];
				if(m<rem)
				{
					flag=1;
					cout<<"No"<<endl;
					break;
				}
				if(rem<=m)
				{
					a[j]+=rem;
					m=m-rem;
				}
			}
		
		}
		if(flag==0)
		{
			if(m>=0)
			{
				if(m%n==0)
				cout<<"Yes"<<endl;
				else
				cout<<"No"<<endl;	
			}
		}
	}
	return 0;
}
