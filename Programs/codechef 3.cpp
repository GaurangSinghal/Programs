#include<iostream>
using namespace std;
int sum(int a,int b)
{
	int sum;
	if(a>b)
	sum=(a-b)*D[b];
	else
	sum=(b-a)*D[b];	
	return sum;
}
int main()
{
	int T,n,j,i,a[100],q,temp,k,D[100000];
	cin>>T;
	for(i=0;i<t;i++)
	{
		temp=0;
		sum=0;
		k=0;
		cin>>n;
		for(j=0;j<n;j++)
		{
			cin>>D[j];
			if(D[j]<0)
			a[k++]=j;
		}
		k=0;
		rem=0; 
	//	rem=-D[a[k]];
		for(j=0;j<n;j++)
		{
			while(q<=-D[a[k]])
			{
				if(D[j]<0)
				continue;
				q=sum(a[k],j);
				++j;
			}
			if(D[j]>0)
			{	
					
							
				if(rem<q)
				{
					while(rem+temp<q)
					{
						temp+=-D[a[k++]];
					}
					--k;
					rem=-(D[a[k]]+q);
				}
				else
				rem=-(D[a[k]]+q);
				
			}
		}
	}
	return 0;
}
