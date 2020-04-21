#include<iostream>
using namespace std;
int main()
{
  int n,t=1,temp=0,a;
  cin>>n;
  
  for(int i=0;i<n-1;i++)
  {
     a = temp;
    temp =t; 
     t = a+t;    
  }
  cout<<temp;
}