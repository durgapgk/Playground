#include<stdio.h>
int main()
{
  	//type your code here
  int  n,i,j;
scanf("%d",&n);
int  a[n];
int  t=0;
for(i=0;i<n;i++)
scanf("%d",&a[i]);
int  max=a[0];
for(i=1;i<n;i++)
{ 
if(a[i]>max)
max=a[i];
}
printf("%d",max);

}