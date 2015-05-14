#include<iostream>
#include<cstdlib>
using namespace std;
int N,M;
int fib(int x);
int main()
{
	int i,j,T,n,sum=0;
	cin>>T;
	for(i=0;i<T;i++)
	{
		sum=0;
		cin>>N>>M;
		n=M-N;
		int *temp=(int*)malloc(n*sizeof(int));
		for(j=N;j<=M;j++)
		{
			sum+=fib(j);
		}
		cout<<sum<<endl;
		free(temp);
	}

	return 0;
}
int fib(int x)
{
	if(a[x]!=-1)
	return a[x];
	
	if(x==1)
	return 1;
	if(x==0)
	return 0;
	a[x]=fib(x-1)+fib(x-2);
	return a[x];
}





