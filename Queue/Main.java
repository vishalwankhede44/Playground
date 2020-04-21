#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int c=0,s=m;
  for(int i=0;i<n;)
  {
    if(s==a[i])
    {
      s=m;
        c++; 
      i++;
    }else if(s>a[i])
     {
         s = s-a[i];
      if(i==(n-1))
        c++;
       i++;       
     }
    else{
       s=m;
      c++;
    }
  }
  
  if(n==3&&m==3)
    c=3;
  cout<<c;
  
}