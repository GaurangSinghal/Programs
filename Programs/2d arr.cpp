#include<iostream>
using namespace std;
void show(int q[][4],int row ,int col)
{
	int i,j;
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			cout<<q[i][j]<<" ";
		}
		cout<<endl;
	}
}
int main()
{
	int a[3][4]={
	
	1,2,3,4,
	5,6,7,8,
	9,10,11,12
	};
	show(a,3,4);
	return 0;
}
