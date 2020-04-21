#include<iostream>
using namespace std;
int main()
{
  int num,n,d=104;
  cin>>n;
  num=121;
  for(int i=0;i<n;i++)
  {
     cout<<num<<" ";
     num +=d;
     d +=32;
  }
}