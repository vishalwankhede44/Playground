#include<iostream>
#include<string>
using namespace std;
int main()
{
  int f,l;
  string num;
  std::cin>>num;
  f=stoi(num.substr(0,1));
  l = (stoi(num)%10);
  std::cout<<f+l;
    
}