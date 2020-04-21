#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  double interest,amt;
  double disc,final_amt;
  interest = (a*b*c)/100;
  disc =(interest*2.0)/100;
  amt = interest+a;
  final_amt = amt - disc;
  std::cout<<interest<<"\n";
  std::cout<<amt<<"\n";
  std::cout<<disc<<"\n";
  std::cout<<final_amt;

  
  
}