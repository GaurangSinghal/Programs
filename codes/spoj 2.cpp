#include<iostream>
using namespace std;
int main()
{
	int a[1000][1000],i,r,c,co=0,j;
	cin>>r;
	cin>>c;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{	
			cin>>a[i][j];
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(i==0)
			{
				if(j==0)
				{
					if(a[i][j]<a[i+1][j]&&a[i][j]<a[i][j+1]&&a[i][j]<a[i+1][j+1])
					{
						++co;
						++j;
					//	cout<<co<<endl;
					}
				}
				
				else if(j==c-1)
				{
				if(a[i][j]<a[i][j-1]&&a[i][j]<a[i+1][j-1]&&a[i][j]<a[i+1][j])
					{
						++co;
					//	cout<<co<<endl;
					}
				}
				else
				{
					if(a[i][j]<a[i][j-1]&&a[i][j]<a[i+1][j-1]&&a[i][j]<a[i+1][j]&&a[i][j]<a[i][j+1]&&a[i][j]<a[i+1][j+1])
					{
						++co;
						++j;
					//	cout<<co<<endl;
					}
				}
			}
			
			
			else if(j==0)
			{
				if(i==r-1)
			{	if(a[i][j]<a[i-1][j]&&a[i][j]<a[i-1][j+1]&&a[i][j]<a[i][j+1])
				{++co;
				++j;}}
				else
			{	if(a[i][j]<a[i-1][j]&&a[i][j]<a[i-1][j+1]&&a[i][j]<a[i+1][j]&&a[i][j]<a[i][j+1]&&a[i][j]<a[i+1][j+1])
				{++co;
				++j;}}
			}
			else if(i==r-1)
			{
				if(j==c-1)
				{if(a[i][j]<a[i-1][j]&&a[i][j]<a[i][j-1]&&a[i][j]<a[i-1][j-1])
				++co;}
				else
				{if(a[i][j]<a[i-1][j]&&a[i][j]<a[i][j-1]&&a[i][j]<a[i-1][j-1]&&a[i][j]<a[i-1][j+1]&&a[i][j]<a[i][j+1])
				{++co;
				++j;}}
			}
			else if(j==c-1)
			{if(a[i][j]<a[i-1][j]&&a[i][j]<a[i][j-1]&&a[i][j]<a[i-1][j-1]&&a[i][j]<a[i+1][j-1]&&a[i][j]<a[i+1][j])
			++co;}
			
			else
			{if(a[i][j]<a[i-1][j]&&a[i][j]<a[i][j-1]&&a[i][j]<a[i-1][j-1]&&a[i][j]<a[i-1][j+1]&&a[i][j]<a[i+1][j-1]&&a[i][j]<a[i+1][j]&&a[i][j]<a[i][j+1]&&a[i][j]<a[i+1][j+1])
			{++co;
			++j;}}
		}
	}
	cout<<co;
	return 0;
}
