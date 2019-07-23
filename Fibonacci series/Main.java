#include<stdio.h>
int main()
{
  //Type your code here
  int a,b=0,b1=1,c,i;
  scanf("%d",&a);
  printf("%d ",b);
   printf("%d ",b1);
   for(i=0;i<=a-3;i++)
    {
       c=b+b1;
     printf("%d ",c);
       b=b1;
       b1=c;
    }
  return 0;
}