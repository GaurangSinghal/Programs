#include <iostream>
using namespace std;
int main()
{
	int a[20][20],i,j,k,l,temp=0;
	cin>>i>>j;
	for(k=0;k<i;k++)
	{
		for(l=0;l<j;l++)
		{
		
		cin>>a[k][l];
		temp=temp+a[k][l];
}
	}
	cout<<temp;
	return 0;
	
}
