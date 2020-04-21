#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  std::cin>>w>>x>>y;
  int total = (w*x)-(w*y)-100;
  std::cout<<total;
}