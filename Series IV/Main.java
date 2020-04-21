#include<iostream>
using namespace std;
int main()
{
  int n,d=2,num,ser=0;
  cin>>n;
  num=n;
  cout<<ser<<" ";
  ser +=d;
  for(int i=0;i<n-1;i++)
  {
     cout<<ser<<" ";
     if(i%2==0)
       d = d+4;
     
    ser = ser+d;
       
  }
}