//#include<stdio.h>
//int main()
//{
	//type your code here
 
#include<stdio.h>
int main()
{
  char na[100],i=0,c=0;
  gets(na);
while(na[i]!='\0')
 {
    i++;
 }
 if(i>20)
 {
   printf("Invalid Input");
 }
else
{
  for(int j=0;j<i;j++)
  {
   if(na[j]==na[j+1])
   {
     c++;
   }
   else
   {
     printf("%c%d",na[j],(c+1));
     c=0;
   }
  }
}
  
  return 0;
}
  
//}