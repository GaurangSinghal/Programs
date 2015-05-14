#include<iostream>
#include<cstring>
using namespace std;
int main()
{
	int i,j,c=0,n,a[1000001],t;
	cin>>t;
	for(i=0;i<t;i++)
	{
		cin n;
		for(i=0;i<n;i++)
		cin>>a[j];
		for(i=0;i<n;i++)
		{
		for(j=i-1;j>=0;j--)
		{
			if(a[i]==a[j])
			c++;
		}
		if(c==0)
		cout<<"ok";
		else
		cout<<"duplicate";
	}
	}
	
}
