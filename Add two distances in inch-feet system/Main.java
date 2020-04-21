#include<iostream>
using namespace std;
struct details{
   double inch,feet;
   
};
int main()
{
  details i1,i2,sum;
  cin>>i1.feet>>i1.inch;
  cin>>i2.feet>>i2.inch;
  sum.feet = i1.feet + i2.feet;
  sum.inch = i1.inch + i2.inch;
  if(sum.inch>=12.0)
  {
     sum.feet++;
     sum.inch -=12;
  }
  cout<<sum.feet<<"\'-"<<sum.inch<<"\"";
  
}