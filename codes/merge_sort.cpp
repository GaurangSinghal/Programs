#include<iostream>
using namespace std;
int merge(int*,int ,int,int,int,int);
int main()
{
	int n,i,a[100];
	cin>>n;
	for(i=0;i<100;i++)
	{
		cin>>a[i];
	}
	
	return 0;
}
int divide()
{
	mid=n/2;
}
int merge(int *p,int strt1,int end1,int strt2,int end2,int strt3)
{
	int j=strt1,k=strt2,l=strt3;
	while(j<end1 && k<end2)
	{
		if(p[j]<q[k])
		{
			r[l]=p[j];
		}
		else
		r[l]=q[k];
		++l;
		++j;
		++k;
	}
	if(j!=end1)
	{
		while(j!=end1)
		{
			r[l]=p[j];
			++l;
			++j;
		}
	}
	else
	{
		while(k!=end2)
		{
			r[l]=q[k];
			++l;
			++k;
		}
	}
	return l;
}





