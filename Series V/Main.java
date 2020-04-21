#include<iostream>
using namespace std;
int main()
{
 int n,val=121,num=104;
  cin>>n;
  for(int i=0;i<n;i++)
  {
     cout<<val<<" ";
    val = val+num;
          num +=32;
  }
}