

    #include<iostream>
    #include<cstring>
   
    using namespace std;
    int main()
    {
    int ls,lb,c=0,d=0,i,temp=0;
    char san[100001],ban[100001];
    cin>>ls;
    cin>>lb;
     
    cin.clear();
    cin.ignore();
    cin.getline(san,ls);
    cin.getline(ban,lb);
    for(i=0;i<ls;i++)
    {
    while(san[i]!=' ' && san[i]!='\0')
    {
    ++c;
    ++i;
     
    }
    if(temp<c)
    {
    temp=c;
    }
    c=0;
    }
    c=0;
    for(i=0;i<lb;i++)
    {
    while(ban[i]!=' '&&ban[i]!='\0')
    {
    ++c;
    ++i;
     
    }
    if(d<c)
    {
    d=c;
    }
    if(d>temp)
    break;
    c=0;
    }
    if(temp>d)
    cout<<"Santa"<<endl;
    else if(d>temp)
    cout<<"Banta"<<endl;
    else
    cout<<"Tie"<<endl;
    return 0;
    }


