#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,inp,c=0;
  cin>>n;
  
  do{
    cin>>inp;
    if(inp<=n){
      sum += inp;
      c++;
    }
    else{
      c++;
		break;
    }
    
  }while(sum<n);
  cout<<"The number of turns is "<<c;
}