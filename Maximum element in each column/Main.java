#include<iostream>
using namespace std;
int main()
{
  int r,c;
  int max;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  
  
  for(int i=0;i<c;i++){
    max = a[i][i];
    for(int j=0;j<r;j++){
       if(max<a[j][i])
         max = a[j][i];
    }
    cout<<max<<endl;
  }
}