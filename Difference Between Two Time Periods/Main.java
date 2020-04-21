#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,m1,m2,m3;
  cin>>n1>>n2>>n3>>m1>>m2>>m3;
 
  int a1,a2,a3;
  if(m3 > n3)
    {
        n2--;
        n3 += 60;
    }
    a3 = n3 - m3;
    if(m2 > n2)
    {
        n1--;
        n2 += 60;
    }
    a2 = n2-m2;
    a1 = n1-m1;

  cout<<a1<<":"<<a2<<":"<<a3;
  
}