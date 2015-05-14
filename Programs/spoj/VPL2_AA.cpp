#include<iostream>
#include<cstdio>
#include<cmath>
using namespace std;

int main()
{
	int t,i;
	double T1,r,p1,p2,T,p;
	cin>>t;
	for(i=1;i<=t;i++)
	{
		cin>>p1>>p2>>T>>p;
		r=(log(p2/p1))/T;
		T1=(log(p/p1))/r;
		printf("Scenario #%d: %.2lf \n",i,(floor(T1*100+0.50))/100);
		
	}

	return 0;
}


