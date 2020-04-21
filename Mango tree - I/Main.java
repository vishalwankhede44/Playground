#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  if(t<=c or t%c==1 or t%c==0)
  	cout<<"Yes";
  else
    cout<<"No";
}