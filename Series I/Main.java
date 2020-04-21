#include<iostream>
using namespace std;
int main()
{
  double n,num;
  cin>>n;
  num=0.5;
  for(int i=1;i<=n;i++)
  {
     cout<<num<<" ";
     num =  num*3;
  }
}