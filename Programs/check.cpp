#include<iostream>
using namespace std;
int main()
{
	char str1[]="hello";
	cout<<str1<<endl;
	char *p="hello";
	cout<<p<<endl;
	str1[]="bye";
	cout<<str1<<endl;
	p="bye";
//	p="hello";
	cout<<p<<endl;
	return 0;
}

