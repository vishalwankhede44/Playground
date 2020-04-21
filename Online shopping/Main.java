#include<iostream>
using namespace std;
int main()
{
  int a1,a2,a3,b1,b2,b3,c1,c2,c3;
  cin>>a1>>a2>>a3>>b1>>b2>>b3>>c1>>c2>>c3;
  int flip,snap,amaz;
  flip = (a1-(a1/100*a2))+a3;
  snap = (b1-(b1/100*b2))+b3;
  amaz = (c1-(c1/100*c2))+c3;
  cout<<"In Flipkart Rs."<<flip;
  cout<<"\nIn Snapdeal Rs."<<snap;
  cout<<"\nIn Amazon Rs."<<amaz;
  if(flip<=snap && flip<=amaz)
    cout<<"\nHe will prefer Flipkart";
  else if(snap<=flip && snap<=amaz)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
}