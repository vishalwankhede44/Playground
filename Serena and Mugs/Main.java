#include<iostream>
using namespace std;
int main()
{
  int n,m,f=0;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]==1)
      f++;
    else
      f--;
  }
  if(f==n)
    cout<<"YES";
 else
    cout<<"NO";
  
}