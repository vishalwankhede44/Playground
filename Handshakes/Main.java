#include<iostream>
using namespace std;
int main()
{
   int n,c=0;;
  cin>>n;
  for(int i=1;i<n;i++)
    for(int j=i;j<n;j++)
      c++;
  cout<<c;
}