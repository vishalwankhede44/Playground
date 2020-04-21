#include<iostream>
using namespace std;
int main()
{
   int n,d,evenSum=0,oddSum=0;
   cin>>n;
   while(n>0){
     d = n % 10;
     if(d%2==0)
       evenSum +=d;
     else
       oddSum +=d;
     n /=10;
   }
   if(evenSum==oddSum)
   	   cout<<"Yes";
   else
       cout<<"No";
}