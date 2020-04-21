#include<iostream>
using namespace std;
int main()
{
  int a,b,s=1;
  cin>>a>>b;
  
  	for(int i=1;i<=b;i++)
    	s = (s*a);
  cout<<"Enter the value of a\nEnter the value of n\n";
  cout<<"The value of "<<a<<" power "<<b<<" is "<<s;
}