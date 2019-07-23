#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  //if(a<c&&a>b||a>c&&
  if(a<c&&a>b)
    printf("%d",a);
  else if(a<b&&a>c)
    printf("%d",a);
  else if(b<c&&b>a)
  { //printf("%d%d",b);
    printf("%d",b);
  }
  else if(b<a&&b>c)
    printf("%d", b);
  else 
    printf("%d",c);
}