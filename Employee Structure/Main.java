#include<iostream>
using namespace std;
struct Employee
{
   char name[30];
   int id,age;
   char designation[20];
   double salary;
};
int main()
{
  Employee e;
  cout<<"Enter name:";
  cin>>e.name;
  cout<<"\nEnter ID:";
  cin>>e.id;
  cout<<"\nEnter age:";
  cin>>e.age;
  cout<<"\nEnter designation:";
  cin>>e.designation;
  cout<<"\nEnter Salary:";
  cin>>e.salary;
  
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.designation;
  cout<<"\nSalary of the Employee : "<<e.salary;
  
}