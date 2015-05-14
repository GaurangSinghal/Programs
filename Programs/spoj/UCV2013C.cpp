#include<iostream>
#include<cstdio>
using namespace std;

int main()
{
	long long int D;
	int i,F,B,M,j,n;
	scanf("%lld %d %d %d",&D,&F,&B,&M);
	while(D!=0|| F!=0|| B!=0|| M!=0)
	{
		n=F*(F+1)/2 +1;
		i=D-(B*n);
		j=B*n + M-D;
		if(i>=M)
		{printf("Farmer Cream will have %d Bsf to spend.\n",i);
		}
		else
		{printf("The firm is trying to bankrupt Farmer Cream by %d Bsf.\n",j);
		}
		
		scanf("%lld %d %d %d",&D,&F,&B,&M);
	}

	return 0;
}






