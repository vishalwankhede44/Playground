#include<iostream>
using namespace std;
int main()
{
  int s,e,t=0;
  cin>>s>>e;
  for(int i=(s+1);i<e;i++)
  {
    for(int j=1;j<i;j++)
    {
       if(i%j==0)
       {
         t=t+j;
       }
    }
    if(i==t)
      cout<<i<<" ";
    t=0;
  }
}