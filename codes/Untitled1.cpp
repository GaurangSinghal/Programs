#include <stdio.h>

int main()
 {
	int i,j,a[100],N,temp=0;
	scanf("%d",&N);
	for(i=0;i<N;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<N-1;i++)
	{
		for(j=i+1;j>0;j--)
		{
			if(a[j]<a[j-1])
			{
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
			if(a[j]<a[j-1])
			break;
		}
	}
	for(i=0;i<N;i++)
	printf("%d",a[i]);
	// your code goes here
	return 0;
}
