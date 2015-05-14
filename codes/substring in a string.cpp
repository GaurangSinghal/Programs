    #include<iostream>
    #include<cstring>
    using namespace std;
    int main()
    {
    	int T,i,j,len1,len2,c=0,d=0,f=0;
    	char S[1001],P[1001];
    	cin>>T;
    		    
    	for(i=0;i<T;i++)
   		 {
   			d=0;
			c=0;
		    cin>>S;
		    cin>>P;
		 
		    len1=strlen(S);
		    len2=strlen(P);
		    for(j=0;j<len1;)
		    {
			    if(S[j]==P[c])
			    {
				    ++j;
				    ++d;
				    ++c;
				    if(d==len2)
				    {
					    cout<<"Yes"<<endl;
					    f=d;
					    break;
				     
				    }
			    }
			    else
			    {
				    j=j-d+1;
				    d=0;
				    c=0;
			    }
		    }
		    if(f!=len2)
		    cout<<"No"<<endl;
   		 }
     
    return 0;
    }

