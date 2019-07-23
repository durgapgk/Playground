/*#include <stdio.h>
int main() {
	//Type your code
	return 0;
}*/
#include <stdio.h>
int main() {
	long int n;
  int prod=1,i=0,t,sum=0,r,d;
    scanf("%ld",&n);
   t=n;
    while(n>0)
    {
      i++;
      n=n/10;
    }
  d=i-1;
  while(d)
  {
    r=t%10;
    sum=(sum*10)+r;
    t=t/10;
    d--;
  }
  
  printf("%d",(sum%10));
  
	return 0;
}