#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int sum=0;
  int a[r][c];
  
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
      sum +=a[i][j];
    }
    cout<<sum<<endl;
    sum=0;
  }
}