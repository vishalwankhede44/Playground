#include<iostream>
using namespace std;
int main()
{
  int n,t,s=0,temp;
  cin>>n>>t;
  temp = n+t;

  for(int i=1;i<temp;i++)
  {
     if(temp%i==0)
     {
       s = s+i;
     }
  }

  if(s==temp)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  
}