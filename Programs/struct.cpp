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
	struct student student1;
	cin>>student1.name>>student1.roll_no>>student1.age;
	struct student student2;
	cin>>student2.name>>student2.roll_no>>student2.age;
	cout<<&student1.name<<" "<<&student1.roll_no<<" "<<&student1.age<<endl;
	cout<<student2.name<<student2.roll_no<<student2.age;

	return 0;
}

