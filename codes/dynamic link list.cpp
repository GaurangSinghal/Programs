#include <iostream>
#include<cstdlib>
using namespace std;

struct node
{
	int val;
	struct node* next;
	
	};
int main()
{
	int n,i;
	struct node *x;
	struct node* p;	
	cin>>n;
	struct node* temp= (struct node*)malloc(sizeof(struct node));	
	cin>>temp->val;
	x=temp;
	for(i=1;i<n;i++)
	{
		p= (struct node*)malloc(sizeof(struct node));
		cin>>p->val;
		temp->next=p;
		temp=temp->next;// or u can write temp = p;
			}
		p->next=NULL;
		while(x->next != NULL)
		{
			cout<< x->val<<endl;
			x=x->next;
		}
		cout<< x->val;
	
	return 0;
}
