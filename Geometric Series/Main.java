#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int  n,i,r,a;
scanf("%d",&n);
if(n%2==0)
{
   a=(n)/2;
    r=pow(3,a-1);
printf("%d",r);
}
else 
{
a=(n+1)/2;
r=pow(2,a-1);
printf("%d",r);
}
  return 0;
}