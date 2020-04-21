#include<iostream>
#include<string>
using namespace std;
int main()
{
   string a,b;
   int j=0,c=0;
   cin>>a>>b;
   for(int i=a.size()-1;i>=0;i--)
   {
     if(a[i]==b[j++])
       c++;
     else{
       c--;
       break;}
   }
  if(c==a.size())
    cout<<"It is correct";
  else
    cout<<"It is wrong";
    
}