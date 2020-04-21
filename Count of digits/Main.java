#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  do
  {
     c++;
    n /=10;    
  }while(n>0);
  cout<<c;
}