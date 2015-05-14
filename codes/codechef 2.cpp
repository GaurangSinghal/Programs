#include<iostream>
using namespace std;
int main()
{
	int t,R,G,B,M,i,j,k,r[100],g[100],b[100],max1,max,max2,max3;
	cin>>t;
	for(i=0;i<t;i++)
	{
		max1=0;
		max2=0;
		max3=0;
		cin>>R>>G>>B>>M;
		for(j=1;j<=R;j++)
		{
			cin>>r[j];
			if(max1<r[j])
			max1=r[j];
		}
		for(j=1;j<=G;j++)
		{
			cin>>g[j];
			if(max2<g[j])
			max2=g[j];
		}
		for(j=1;j<=B;j++)
		{
			cin>>b[j];
			if(max3<b[j])
			max3=b[j];
		}
		for(j=1;j<=M;j++)
		{
			max=(max1>max2?max1:max2)>max3?(max1>max2?max1:max2):max3;
		//	cout<<max<<endl;
			if(max==max1)
			{				
				for(k=1;k<=R;k++)
				{
					r[k]=(r[k])/2;	
					
				}
				max1=(max1)/2;
			}
			else if(max==max2)
			{
				for(k=1;k<=G;k++)
				{
					g[k]=(g[k])/2;
					
				}
				max2=(max2)/2;
			}
			else
			{
				for(k=1;k<=B;k++)
				{
					b[k]=(b[k])/2;
					
				}
				max3=(max3)/2;
			}				
		}
	max=(max1>max2?max1:max2)>max3?(max1>max2?max1:max2):max3;
	cout<<max<<endl;
	}
	return 0;
}
