#include<iostream>
using namespace std;
int main()
{
  int unit;
  cin>>unit;
  if(unit<=200)
    cout<<"Rs."<<(int)(unit*0.5);
  else if(unit<=400)
    cout<<"Rs."<<(int)(unit*0.65)+100;
  else if(unit<=600)
    cout<<"Rs."<<(int)(unit*0.80)+200;
  else
    cout<<"Rs."<<(int)(unit*1.25)+425;

    
}