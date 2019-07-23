/*#include <stdio.h>
int main() {
	//Type your code
	return 0;
}*)*/
/*#include <stdio.h>
int main() {
	long int n;
  int pro=1,i=0,t,sum=0,r,d;
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
    pro=pro*10;
    d--;
  }
  int l=t%10;
  int f=t/pro;
  printf("%d",(l+f));
	return 0;
}*/
#include <stdio.h>
int main() {
	//long int n;
  int n;
  int pro=1,i=0,t,sum=0,r,d;
    scanf("%ld",&n);
  int n1;
   t=n;
    while(n>0)
    {
      //i++;
      //n1=n/10;
      n1=n%10;
      n=n/10;
      sum=sum+n1;
    }
  /*d=i-1;
  while(d)
  {
    pro=pro*10;
    d--;
  }
  int l=t%10;
  int f=t/pro;
  printf("%d",(l+f));*/
  printf("%d", sum) ;
	return 0;
}