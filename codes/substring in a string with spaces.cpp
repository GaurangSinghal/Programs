#include<iostream>
#include<cstring>
using namespace std;
struct student
{
	char name[100];
	char surname[100];
	int roll_no;
	int age;
};
int main()
{
	int i,t,n,j,len[100],k,l2;
	char sur[100];
	cin>>t;
	struct student student3[100];
	for(i=0;i<t;i++)
	{
		cin>>n;
		cin.ignore();
		cin.clear();
		for(j=0;j<n;j++)
		{
			cin>>student3[j].name;
			cin>>student3[j].surname;
			cin>>student3[j].age>>student3[j].roll_no;
			cin.ignore();
			cin.clear();
			len[j]=strlen(student3[j].surname);
		}
		cin>>sur;
		l2=strlen(sur);
		for(j=0;j<n;j++)
		{
		
					if(strcmp(student3[j].surname,sur)==1)
					cout<<student3[j].age;
		}
	}
	return 0;
}

