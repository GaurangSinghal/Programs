#include <iostream>
#include<cstring>
using namespace std;
int main()
{
 	char a[20];
 	int i,len=0,c=0;
	cin>>a;
	len=strlen(a);
	for(i=0;i<len/2;i++)
	{
		if(a[i]==a[len-i-1])
		++c;
	}
	if(c==len/2)
	cout<<"pallendrome";
	else
	cout<<"not";
	return 0;
	
}
