#include<stdio.h>
#include<conio.h>
#include<string.h>

int num;

char ch[10], string[10];
int count(char,int );
int dfa[10][10];

int main()
{

     int i,j,s=0,final=0;
     
     int ns, nf;
     int f[10];
     printf("enter no. of states of dfa :\n");
     scanf("%d",&ns);
     printf("enter no. of input symbols:\n");
     scanf("%d",&num);
     printf("\n enter input symbols\t");

     for(i=0; i<num; i++) 
     {
           printf("\n\n %d input\t", i+1);
           printf("%c",ch[i]=getch());
     }

     printf("\n\n enter no. of final states: \t");
     scanf("%d",&nf);

     for(i=0;i<nf;i++)
     {
          printf("\n\n Final state %d : q",i+1);
          scanf("%d",&f[i]);
     }

     printf("\n\n transition rule is (initial state, input symbol ) = final state\n");

     for(i=0; i<num; i++)
     {
          for(j=0; j<ns; j++)
          {
               printf("\n(q%d , %c ) = q",j,ch[i]);
               scanf("%d",&dfa[i][j]);
          }
     }

     do
     {
          i=0;
          printf("\n\n Input String.. ");
          scanf("%s",string);

          while(string[i]!='\0')
          if((s=count(string[i++],s))<0)
          break;
          for(i=0 ;i<nf;i++)
          if(f[i] ==s )
          final=1;
          if(final==1)
          printf("\n valid string"); 
          else
          printf("invalid string");
          getch();

          printf("\n continue?  \n(y/n) ");
     }
     while(getch()=='y');

     getch();
}
int count(char b,int d)
{
     int j;
     for(j=0; j<num; j++)
     if(b==ch[j])
     return(dfa[d][j]);
     return -1;
}


