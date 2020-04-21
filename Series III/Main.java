#include<iostream>
using namespace std;
int main()
{
   int n,d=5,s=6;
   cin>>n;
   for(int i=0;i<n;i++)
   {
     cout<<s<<" ";
     s = s+d;
     d=d+5;
   }
   
}