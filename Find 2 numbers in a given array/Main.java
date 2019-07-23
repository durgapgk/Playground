#include<stdio.h>
int main()
{
  	//type your code here
  int n;
scanf("%d",&n);
int  a[n],ele1=-1,ele2=-1;
int  i;
int  t1,t2;
for(i=0;i<n;i++)
scanf("%d",&a[i]);
scanf("%d%d",&t1,&t2);
for(i=0;i<n;i++)
{
   if(a[i]==t1&&ele1==-1)
      ele1=i;
}
for(i=0;i<n;i++)
{
   if(a[i]==t2&&ele2==-1)
      ele2=i;
}
  printf("Element 1 index = %d\n",ele1);
 // printf("Element 12 index = 2
  printf("Element 2 index = %d",ele2);
}