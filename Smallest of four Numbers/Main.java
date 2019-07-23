#include<stdio.h>

int main()
{
  // Type your code here
  int a,b,c,d;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  if(a<b&&a<c&&a<d)
  printf("%d",a);
  else if(a>b&&b<c&&b<d)
    printf("%d",b);
   else if(a>c&&b>c&&c<d)
     printf("%d",c);
  else 
    printf("%d",d);
}