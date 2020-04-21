#include<iostream>
using namespace std;
int getExp(int,int);
int main()
{
   int m,n,req;
   cin>>m>>n>>req;
   if(getExp(m,n)>=req)
     cout<<"Doctor, you can proceed with your experiment.";
   else
     cout<<"Sorry Doctor! You need more bacteria.";
}
int getExp(int m,int n)
{ 
  int t=0;
    for(int i=1;i<n;i++)
    {
       t +=  m*m;
    }
  return t;
}