#include<iostream>
#include<cstring>
using namespace std;
int main()
{
	int i,j,n;
	cin>>n;
	char a[n][100],tmp[100];
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			strcpy(tmp,a[j]);
			strcpy(a[j],a[j+1]);
			strcpy(a[j+1],tmp);
		}
	}
	for(i=0;i<n;i++)
	{
		cout<<a[i]<<endl;
	}
	return 0;
}
