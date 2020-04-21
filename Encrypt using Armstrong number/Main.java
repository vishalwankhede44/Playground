#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int c=0,t,sum=0;
    t=n;
    while(t!=0)
    {
       c++;
       t /=10;
    }
    t=n;
    while(t!=0)
    {
       sum +=power(t%10,c);
       t /=10;
    }
    if(sum==n)
      return 1;
    else
      return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}