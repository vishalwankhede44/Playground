#include<iostream>
using namespace std;
int main()
{
  string d;
  int n;
  cin>>d>>n;
  if(d=="front")
    if(n==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  else
    (n==1)?cout<<"Right Handed":cout<<"Left Handed";
}