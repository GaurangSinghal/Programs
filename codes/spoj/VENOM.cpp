#include<iostream>
#include<cmath>
# include<cstdio>
using namespace std;

int main()
{
	int z;
	float t,H,P,A,i,n;
	cin>>t;
	for(i=1;i<=t;i++)
	{
		scanf("%f%f%f",&H,&P,&A);
		if(H<=P)
		{
			printf("1\n");
			continue;
		}
		n=ceil((2*A-P+sqrt((P-2*A)*(P-2*A)-8*(A-H)*P ))/(2*P));
		z=(int)2*n-1;
		printf("%d\n",z);
		
	}

	return 0;
}


