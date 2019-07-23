#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c,c1,a2,a1;
  scanf("%f",&a);
  scanf("%f",&b);
  a1=a*a;
  a2=b*b;
  c1=a1+a2;
  c=sqrt(c1);
  printf("%0.2f",c);
  return 0;
}