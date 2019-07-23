/*#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  prin
  if(a%4==0)
    
  return 0;
}*/
#include<stdio.h>
int main()
{
  int year,f=0;
  scanf("%d",&year);
  if(year%100==0)
  {
    if(year%400==0)
    {
      f=1;
    }
  }
  else if(year%4==0) 
  {
    f=1;
  }
  if(f==1)
  {
    printf("Leap year");
  }
  else 
  {
    printf("Not Leap year");
  }
           
  
  return 0;
}