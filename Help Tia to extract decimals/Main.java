#include<iostream>
#include<string>
using namespace std;
int main()
{
   string num;
   cin>>num;
   int f=0;
  cout<<"Floating part is : ";
   for(int i=0;i<num.size();i++)
   { 
      if(f==1)
        cout<<num[i];
      if(num[i]=='.')
         f=1;
     
   }
  
}