#include<stdio.h>
void convert(int n, int bs)
{
	if(n/bs == 0)
	{
	printf("%d",n);
	return;
	}
	convert(n/bs,bs);
	printf("%d",n%bs);
}
int main()
{
	int n;
	scanf("%d",&n);
	convert(n,2);
	return 0;
}

