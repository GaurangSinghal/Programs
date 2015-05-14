#include <stdio.h>
#include <string.h>
int main()
{
	int i;
	int n =0;
	for(i=0; ;i++)
	{
	scanf("%d",&n);
	if(n!=42)
	printf("%d\n", n);
	else
	break;
	}
	return 0;
}
