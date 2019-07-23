#include<stdio.h>
int main()
{
  //Type your code here
  char a[128],i;
  int count=1;
  scanf("%[^\n]s",a);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==' ')
      count=count+1;
  }
  printf("%d",count);
}