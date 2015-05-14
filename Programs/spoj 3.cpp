#include<iostream>
#include<cstring>
using namespace std;
int main()
{
	int n,i,temp,temp1,temp2,j;
	cin>>n;
	int g[n],s[n],b[n];
	char ctry[n][101];
	char tmp[101];
	for(i=0;i<n;i++)
	{
		cin>>ctry[i];
		cin>>g[i]>>s[i]>>b[i];
	}
	
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(g[j]<g[j+1])
			{
			//	cout<<g[j]<<" "<<g[j+1]<<endl;
			//	getchar();
				temp=g[j];
				g[j]=g[j+1];
		    	g[j+1]=temp;
		    //	cout<<g[j]<<" "<<g[j+1]<<endl;
		    //	getchar();
		    //	cout<<s[j]<<" "<<s[j+1]<<endl;
		    //	getchar();
				temp1=s[j];
				s[j]=s[j+1];
				s[j+1]=temp1;
			//	cout<<s[j]<<" "<<s[j+1]<<endl;
		    //	getchar();
				temp2=b[j];
				b[j]=b[j+1];
				b[j+1]=temp2;
			//	cout<<tmp<<" "<<ctry[j]<<" "<<ctry[j+1]<<endl;	
			//	getchar();
				strcpy(tmp,ctry[j]);
				strcpy(ctry[j],ctry[j+1]);
				strcpy(ctry[j+1],tmp);	
			//	cout<<tmp<<" "<<ctry[j]<<" "<<ctry[j+1]<<endl;	
			//	getchar();
			}
			if(g[j]==g[j+1])
			{
				if(s[j]<s[j+1])
				{
					temp=g[j];
					g[j]=g[j+1];
					g[j+1]=temp;
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
					strcpy(tmp,ctry[j]);
					strcpy(ctry[j],ctry[j+1]);
					strcpy(ctry[j+1],tmp);	
				}
				if(s[j]==s[j+1])
				{
					if(b[j]<s[j+1])
					{
						temp=g[j];
						g[j]=g[j+1];
						g[j+1]=temp;
						temp=s[j];
						s[j]=s[j+1];
						s[j+1]=temp;
						temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
						strcpy(tmp,ctry[j]);
						strcpy(ctry[j],ctry[j+1]);
						strcpy(ctry[j+1],tmp);	
					}
				}
			}
		}
	}
	for(i=0;i<n;i++)
	{
	cout<<ctry[i]<<endl;}
	return 0;
}
