#include<iostream>
using namespace std;
struct College{
 char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};
int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  College e[n];
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>e[i].name;
    cout<<"\nEnter city";
    cin>>e[i].city;
    cout<<"\nEnter year of establishment";
    cin>>e[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>e[i].passPercentage;    
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<e[i].name;
    cout<<"\nCity:"<<e[i].city;
    cout<<"\nYear of establishment:"<<e[i].establishmentYear;
    cout<<"\nPass percentage:"<<e[i].passPercentage;    
  }
}