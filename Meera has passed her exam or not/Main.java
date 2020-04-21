#include<iostream>
using namespace std;
int main()
{
   int n,reg;
  bool f=0;
   cin>>n;
   int a[n];
   for(int i=0;i<n;i++)
   {
       cin>>a[i];
   }
   cin>>reg;
   for(int i=0;i<n;i++)
    {
         if(a[i]==reg){
         cout<<"She passed her exam";
         f=1;
         break;
       }
   }
   if(!f)
   cout<<"She failed";
  
}