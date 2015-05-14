#include <stdio.h>

int main()
 {
	int i,a[100],N,temp=0;
	scanf("%d",&N);
	for(i=0;i<N;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=1;i<=N;i++)
	{
		if(a[i-1]>a[i])
		{
			temp =a[i];
			a[i]=a[i-1];
			a[i-1]=temp;
			if(i>1)
			i--;
		}
		else
		i++;
	}
	for(i=0;i<N;i++)
	printf("%d",a[i]);
	// your code goes here
	return 0;
}

