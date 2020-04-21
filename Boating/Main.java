#include<iostream>
using namespace std;
int main()
{
  int weight,adults,childrens;
  cin>>weight>>adults>>childrens;
  int total = (adults*75) + (childrens*30);
  if(total<=weight)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}