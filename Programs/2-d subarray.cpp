#include <iostream>
using namespace std;
int main()
{
	int a[100][100],i,j,x,y,k,l,p,q,c=0;
	cin>>k>>l;
	for(i=0;i<k;i++)
	{
		for(j=0;j<l;j++)
		cin>>a[i][j];
	}
	cout<<"enter staring point ";
	cin>>p>>q;
	cout<<"enter no. of rows and columns";
	cin>>x>>y;
	for(i=p;i<p+x;i++)
	{
		for(j=q;j<q+y;j++)
		cout<<a[i][j]<<" ";
		cout<<endl;
	}
	return 0;
}
