#include<iostream>
using namespace std;
int main()
{
  int a,b;

  cin>>a>>b;

  if(a>=20)
    a=1900+a;
  else
    a=2000+a;
  if(b>=33)
    b=1900+b;
  else
    b=2000+b;
   
  cout<<abs(a-b);
}