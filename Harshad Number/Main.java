#include<iostream>
using namespace std;
int main()
{
  int n,d,s=0,t;
  cin>>n;
  t=n;
  while(n>0)
  {
     d = n%10;
     s = s+d;
    n=n/10;
  }
  if(t%s==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
  
}