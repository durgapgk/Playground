#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int a,b,i=0,sum=0,a1,j;
  scanf("%d",&a);
  while(a!=0)
  {
    b=a%10;
    sum=sum + pow(2,i)*b;
    i++;
    a=a/10;
  }
  printf("%d",sum);
  return 0;
}