#include<iostream>
#include<cstring>
using namespace std;
struct Student
{
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa;
};
int main()
{
  int n;
 cout<<"Enter the number of students";
  cin>>n;
  Student s[n],t;
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of student "<<i+1;
    cout<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter department";
    cin>>s[i].department;
    cout<<"\nEnter year of study";
    cin>>s[i].yearOfStudy;
    cout<<"\nEnter cgpa";
    cin>>s[i].cgpa;
  }
  
  cout<<"\nDetails of students";
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(strcmp(s[i].name,s[j].name)>0)
      {
          t = s[i];
        s[i] = s[j];
        s[j] = t;
      }
    }
  }
  for(int i=0;i<n;i++)
  {
     cout<<"\nStudent "<<i+1;
     cout<<"\nName:"<<s[i].name;
     cout<<"\nDepartment:"<<s[i].department;
     cout<<"\nYear of study:"<<s[i].yearOfStudy;
     cout<<"\nCGPA:"<<s[i].cgpa;
  }
  
}