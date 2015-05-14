#include<iostream>
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
	struct node* a;
	struct node* fl;		
	struct node* b;		
	cin>>n;
	struct node* temp= (struct node*)malloc(sizeof(struct node));	
	cin>>temp->val;
	x=temp;
	a=temp;
	for(i=1;i<n;i++)
	{
		p= (struct node*)malloc(sizeof(struct node));
		cin>>p->val;
		temp->next=p;
		temp=temp->next;// or u can write temp = p;
			}
		p->next=NULL;
		b=a->next;
		a->next=NULL;
		while(b!=NULL)
		{
			fl=b->next;
			b->next=a;
			a=b;
			b=fl;
		}
		x=a;
		
		while(x->next != NULL)
		{
			cout<< x->val<<endl;
			x=x->next;
		}
		cout<< x->val;
	
	return 0;
}
