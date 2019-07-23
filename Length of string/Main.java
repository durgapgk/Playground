#include<stdio.h>
#include<string.h>
//#include<conio.h>
int main()
{
  //Type your code here
  char str[100];
  gets(str);
  int t;
  t=strlen(str);
  printf("%d",t);
  return 0;
}