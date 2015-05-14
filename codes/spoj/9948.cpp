#include<iostream>
using namespace std;
int main()
{
	long long int n,x=5;
	cin>>n;
	
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
		{
			cout<<"TAK"<<endl;
			x=0;
	    }
		else
		cout<<"NIE"<<endl;
	
	
	return 0;
}

