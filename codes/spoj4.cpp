#include <iostream>
#include<cstdlib>
using namespace std;
struct list
{
	int s;
	struct list* next;
};
int main()
{
	char a;
	int n,i,b,c,no,d;
	cin>>n;
	struct list* p;
	struct list* head;
	p=(struct list*)malloc(sizeof(struct list));
	head= p;
	struct list*lq=p;
	struct list*lk;
	struct list*pt=p;
	struct list* temp;
	cin>>p->s;
	for(i=2;i<=n;i++)
	{
		temp=(struct list*)malloc(sizeof(struct list));
		cin>>temp->s;
		p->next=temp;
		p=p->next;
	}
	p->next=NULL;
	cin>>a;
	while(a!='#')
	{
		if(a=='I')
		{
			pt=head;
			cin>>b>>c;
			if(b==0)
			{
				struct list* ptr=(struct list*)malloc(sizeof(struct list));
				ptr->s=c;
				ptr->next=head;		
				head=ptr;
				lq=head;
			}
			else if(b!=n)
			{
				struct list* ptr=(struct list*)malloc(sizeof(struct list));
				for(i=1;i<b;i++)
				{
					 pt=pt->next;
				}
				struct list*q=pt->next;	
				pt->next=ptr;	
				ptr->s=c;
				ptr->next=q;
				n=n+1;
			}
			else
			{
				struct list* ptr=(struct list*)malloc(sizeof(struct list));
				for(i=1;i<b;i++)
				{
					 pt=pt->next;
				}
				ptr->s=c;
				pt->next=ptr;
				ptr->next=NULL;
				n=n+1;
			}
			
		}
		if(a=='D')
		{
			lk=head;
			cin>>no;
			for(i=1;i<no-1;i++)
			{
				 lk=lk->next;
			}
			if(no==1)
			{
				head=lk->next;
				lq=head;
			}
			else if(no!=n)
			{
				struct list*lm=lk;
			//	lm=lm->next;
				lm=(lm->next)->next;
				lk->next=lm;
				n=n-1; 
			}
			else
			{
				lk->next=NULL;
				n=n-1;
			}
		}
		if(a=='P')
		{
			
			while(lq!=NULL)
			{
				cout<<lq->s<<" ";
				lq=lq->next;	
			}	
			cout<<endl;
			lq=head;			
		}
		cin>>a;
	}
	return 0;
}
