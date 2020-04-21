#include<iostream>
using namespace std;
int main()
{
   string a,b;
   cin>>a;
   int j=0;
   for(int i=0;i<a.size();i++)
   {
       if((a[i]>=65 && a[i] <=90) || (a[i]>=97 && a[i]<=122)){
          cout<<a[i];
       }
   }

}