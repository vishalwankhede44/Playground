#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,mc=0,nc=0;
  cin>>n;
  int *p = (int *)malloc(n*sizeof(int));
                         
  for(int i=0;i<n;i++)
  {
     cin>>*(p+i); 
     if(*(p+i) %2 !=0)
       mc++;
     else
       nc++;
  }
  cout<<mc<<endl;
  cout<<nc;
  return 0;
}