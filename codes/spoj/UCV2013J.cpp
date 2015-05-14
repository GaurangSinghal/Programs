#include<iostream>
#include<cmath>
# include<cstdio>
using namespace std;

int main()
{
	int i,j,t,N,a[1000000],k,cnt=0,sum,l,su=0,rem;
	cin>>N;
	while(N!=0)
	{
		for(j=0;j<N;j++)
		cin>>a[j];
		
		cnt=0;
		su=0;
		k=N;
		while(N!=1)
		{
			N=N/2;
			++cnt;
		}
		N=k;
		for(j=0;j<N;j++)
		{
			sum=pow(2,cnt)-1;
			rem=N-sum;
		
		}
			if(N!=1)
			{
				for(l=sum;l<N;l++)
				{
					su=su+a[l];
				}
			}
		cout<<su<<endl;
			cin>>N;
	}

	return 0;
}

