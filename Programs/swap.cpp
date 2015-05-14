#include<iostream>
using namespace std;
void swap(int*a,int*b)
{
	int temp=0;
	temp=*a;
	*a=*b;
	*b=temp;
	
	
}
int main()
{
	int a=5,b=7;
	cout<<a<<" "<<b<<endl;
	swap(&a,&b);
	cout<<a<<" "<<b;
	return 0;
}
