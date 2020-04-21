#include<iostream>
using namespace std;
int main()
{
  int age;
  double show;
  cin>>age>>show;
  if(age>13)
  {
    if(show==13.30)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  else{
    if(show==13.30)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
}