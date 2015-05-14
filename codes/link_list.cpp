#include<iostream>
#include<cstdlib>
using namespace std;

struct student
{
	int val;
	struct student* next;	
};
int main()
{
	struct student stu;
	int max,min,m,c,n,i,p;
	struct student *temp;
	struct student *head;
	cin>>n;
	struct student *add=(struct student *)malloc(sizeof(struct student));
	cin>>add->val;
	temp=add;
	max=add->val;
	min=add->val;
	for(i=1;i<n;i++)
	{
		head=(struct student *)malloc(sizeof(struct student));
		cin>>head->val;
		add->next=head;
		add=head;
		if(head->val>max)
		{
			max=head->val;
			m=i;
		}
		
		if(head->val<max)
		{
			min=head->val;
			p=i;
		}
		
	}
	head->next=NULL;
	cout<<max<<" "<<m+1<<endl;
	
	cout<<min<<" "<<p+1;
	
	return 0;
}
