#include<iostream>
using namespace std;
struct student
{
	char name[100];
	int roll_no;
	int age;
};
int main()
{
int i;
	struct student student3[3];
	for(i=0;i<3;i++)
	{cin>>student3[i].name>>student3[i].roll_no>>student3[i].age;
	
	}
for(i=0;i<3;i++)
	{
	cout<<student3[i].name<<student3[i].roll_no<<student3[i].age<<endl;
	}
	return 0;
}

