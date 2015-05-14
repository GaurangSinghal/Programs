#include<iostream>
#include<cstdlib>
using namespace std;
void push(int);
int pull();
void display()
struct node
{
	int info;
	struct node* next;
}
struct node *top1,*top2;
top1=NULL;
top2=NULL;
int main()
{
	struct node *temp1;
	struct node	*temp2;
	int item,n,i;
	while(1)
	{
		cin>>n;
		switch(n)
		{
			case 1:
				cin>>item;
				push(item);
				break;
			case 2:
				i=pull();
				cout<<"popped item = "<<i;
				break;
			case 3:
				display();
				break;
			case 4:
				exit(1);
			default:
				cout<<"wrong choice";	
		}
	}
	return 0;
}
void push(int item)
{
	struct node *temp;
	temp=(struct node*)malloc(n*(sizeof(struct node)));
	temp->info=item;
	temp->link=top1;
	top1=temp;
}
void push2(int item)
{
	struct node *temp;
	temp=(struct node*)malloc(n*(sizeof(struct node)));
	temp->info=item;
	temp->link=top2;
	top2=temp;
}
int pull()
{
	if(top1==NULL)
	{
		cout<<"stack underflow"<<endl;
		return;
	}
	struct node *temp;
	int t;	
	if(top2!=NULL)
	{
		temp=top2;
		t=temp->info
		top2=temp->link;
		free(temp);
		return t;
	}
	else
	{
		while(top1!=NULL)
		{
			temp=top1;
			t=temp->info
			top1=temp->link;
			free(temp);
			push2(t);
			
		}
	}
	void display()
	{
		
	}
}

