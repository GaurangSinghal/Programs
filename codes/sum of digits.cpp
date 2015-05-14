#include<iostream>
using namespace std;
int sumofdigits(int);
int main()
{
	int i,sum=0,d,c=0;
	char a[100000];
	cin>>a;
	if(a[1]>='0')
	c=1;

		for(i=0;;i++)
	{
		if(a[i]=='\0')
		break;
		sum=sum+a[i]-48;
		
	}
	while(sum>9)
	{++c;
	sum=sumofdigits(sum);	
		}
	cout<<c<<endl;

	
	return 0;
}
int sumofdigits(int n)
{
	int i,sum=0;
	while(n!=0)
	{
		sum=sum+n%10;
		n=n/10;
	}
	return sum;
}

