#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  cin>>n;
  cout<<n+floor(sqrt(n))+ceil((1/sqrt(n)));
}