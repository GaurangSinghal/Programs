#include <iostream>
using namespace std;

struct node
{
	int val;
	struct node* next;
	
	};
int main()
{
	struct node one,two,three ;
	one.val=1;
	one.next=&two;
	two.val=2;
	two.next=&three;
	three.val=10;
	three.next=NULL;
	struct node* temp;
	temp=&one;
	while(temp!=NULL)
	{
		cout<<temp->val<<endl;
		temp=temp->next;
	}

	return 0;
}
