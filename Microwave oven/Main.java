#include<iostream>
using namespace std;
int main()
{
  int a;
  double b;
  cin>>a>>b;
  switch(a)
  {
    case 1:cout<<b; break;
    case 2:cout<<(b+(b/100*50)); break;
    case 3:cout<<b*2; break;
    default:cout<<"Number of items is more";  
  }
}