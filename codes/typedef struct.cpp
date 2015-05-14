#include<stdio.h>
#include<conio.h>
typedef struct{
float real;
float imag;
} _COMPLEX;
_COMPLEX add(_COMPLEX x, _COMPLEX
y)
{
_COMPLEX t;
t.real = x.real + y.real;
t.imag = x.imag + y.imag ;
return (t) ;
}
int main()
{
_COMPLEX a, b, c;
scanf("%f %f",&a.real, &a.imag);
scanf("%f %f", &b.real, &b.imag);
c = add(a, b) ;
printf("\n %f %f", c.real, c.imag);


return 0;
}
