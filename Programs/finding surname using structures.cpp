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
	int i,t,n,j;
	char sur[100];
	cin>>t;
	struct student student3[100];
	for(i=0;i<t;i++)
	{
		cin>>n;
		
		for(j=0;j<n;j++)
		{
			cin>>student3[j].name;
			cin>>student3[j].surname;
			cin>>student3[j].age>>student3[j].roll_no;
		}
		cin>>sur;
	}
	for(j=0;j<n;j++)
		{
			if(strcmp(sur,student3[j].surname)==0)
			cout<<student3[j].age<<endl;
		}		

	
	return 0;
}

