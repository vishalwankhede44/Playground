#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  if(c*2==t||((r*c)-c == t))
     cout<<"It is a mango tree";
  else
     cout<<"It is not a mango tree";
    
}