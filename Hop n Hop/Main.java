#include<iostream>
using namespace std;
int main()
{
  int hX=3 , hY=4;
  int fx,fy;
  std::cin>>fx>>fy;

  if(fx>fy)
  {
     std::cout<<abs(hX-fx);
  }
  else
  {
    std::cout<<abs(hY-fy);
  }
}