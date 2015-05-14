#include<iostream>
#include<cstring>
using namespace std;
int pos(char);
char a[]={'G','R','Y','B','O'};
int main()
{
	int i,j,max,sm,rem=0,len,C,T,k,cnt=0;
	char S[1000001];
	cin>>T;
	for(i=1;i<=T;i++)
	{
		max=0;
		cin>>C>>S;
		len=strlen(S);
		for(j=0;j<len;j++)
		{
			k=j;
			while(rem<=C && j<len-1)
			{
				sm= pos(S[j+1])>=pos(S[j])?pos(S[j+1])-pos(S[j]):pos(S[j])-pos(S[j+1]);
				rem=rem+ sm;
				++j;
				++cnt;
				if(j==len-1)
					++cnt;
				
			}
				
			j=k;
			if(max<cnt)
			max=cnt;
			cnt=0;
			rem=0;
		}
		cout<<"scenario #"<<i<<": "<<max<<endl;
	}
		return 0;
}
	int pos(char m)
	{
		int i;
		for(i=0;i<5;i++)
		{
			if(a[i]==m)
			return i;
		}
	}
		



