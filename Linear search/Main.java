/*"#include<stdio.h>
int main()
{
  //Type your code here
  return 0;
}*/
#include<stdio.h>
int main()
{
  int n,f=0;
  scanf("%d",&n);
  int a[n];
  int se;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&se);
  for(int i=0;i<n;i++)
  {
   if(a[i]==se)
   {
     printf("%d",i+1);
     f=1;
     break;
   }
  }
  if(f==0)
  {
    printf("%d isn't present in the array.",se);
   }
  return 0;
}