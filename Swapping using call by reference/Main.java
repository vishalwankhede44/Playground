#include<iostream>
using namespace std;
int main()
{
   int a,b,t;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b;
  t=a;
  a=b;
  b=t;
  cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
}