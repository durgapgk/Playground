#include<stdio.h>
int main()
{
  //Type your code here
  
  double a,b,c,r1,r2,rp,ip;
  double d;
  scanf("%lf%lf%lf",&a,&b,&c);
  d=b*b-4*a*c;
  if(d>0)
  {
    r1=(-b+sqrt(d))/(2*a);
    //r2=(-b-sqrt(d))/+2*a)
 // r2=(-b+sqrt(d))/(2*a);
    r2=(-b-sqrt(d))/(2*a);
printf("root1 = %.2lf  root2 = %.2lf",r1,r2);
  }
else if(d==0)
{ 
r1=-b/(2*a);
printf("root1 = %.2lf  root2 = %.2lf",r1,r1);
}
else 
{ 
rp=-b/(2*a);
ip=sqrt(-d)/(2*a);
printf("root1 = %.2lf + %.2lfi  root2 = %.2lf - %.2lfi",rp,ip,rp,ip);

}
}