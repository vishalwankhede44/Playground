#include<iostream>
using namespace std;
int main()
{
  int n1,n2,small,gcd;
  cin>>n1>>n2;
  n1<n2?small=n1:small=n2;
  
  while(small>0)
  {
      if(n1%small==0 && n2%small==0)
      {
        gcd=small;
        break;
      }
    small--;
  }
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd;
  
}