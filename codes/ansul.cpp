#include<iostream>
#include<cstring>
using namespace std;
int main()
{   int t,len1,len2,n,i,j;
    cin>>t;
    char c1[100];
    char c2[100];
	while(t--)
	   {
	   	 cin>>c1;
	   	 len1=strlen(c1);
	   	 cin>>c2;
	   	 len2=strlen(c2);
	   	 if(c2<c1)
	   	 cout<<"No"<<endl;
	   	 for(i=0;i>len1;i++)
	   	   {
	   	   	for(j=0;j<=i;j++)
	   	   	   if(c1[j]==c2) 
	   	   	   cout<<"Yes"<<endl; 
	   	   	     else
	   	   	   cout<<"No"<<endl;
	   	   }
	   	
	   	return 0;
	   	
	   }
	
	
	






}
