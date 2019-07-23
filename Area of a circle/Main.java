/*#include<stdio.h>
int main()
{
  //Type your code here
  return 0;
}*/
#include<stdio.h>
#define PI 3.14
int main()
{
 int n;
  float r,res;
  scanf("%d",&n);
  r=(float) n/2;
  res=PI*r*r;
  printf("%0.2f",res);
}