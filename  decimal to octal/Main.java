#include<stdio.h>
int main()
{
  //type your code here
  //type your code here
   int n,arr[128],i,rem=0;
  scanf("%d",&n);
  while(n!=0)
  {
     arr[rem++]=n%8;
    n=n/8;
  }
  for(i=rem-1;i>=0;i--)
    printf("%d",arr[i]);
  return 0;
}