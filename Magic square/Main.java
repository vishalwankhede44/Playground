#include<iostream>
using namespace std;
int main()
{
  int r,c,sumr=0,sumc=0,sumd=0;
  cin>>r;
  int a[r][r];
  for(int i=0;i<r;i++){
    for(int j=0;j<r;j++){
		cin>>a[i][j];
      if(i==j)
        sumd += a[i][j];
      if(i==0)
        sumr +=a[i][j];
      if(j==0)
        sumc +=a[i][j];
    }}
  //cout<<sumr<<" "<<sumc<<" "<<sumd<<endl;
  if(sumr==sumc && sumc==sumd)
    cout<<"Yes";
  else
    cout<<"No";
  
  
}