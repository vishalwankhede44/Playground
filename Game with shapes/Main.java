#include<iostream>
using namespace std;
int main()
{
  int x,r;
  cin>>r>>x;
  int l=r*2; 
  if(x>=l)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square"; 
}