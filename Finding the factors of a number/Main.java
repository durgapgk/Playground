#include <stdio.h>
int main() {
	//Type your cod
  int a;
  int i;
  scanf("%d",&a);
    for(i=1;i<=a;i++)
    {
      if(a%i==0)
        printf("%d\n",i);
    }
	return 0;
}