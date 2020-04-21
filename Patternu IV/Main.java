#include <iostream>
using namespace std;
int main() {
   int num=1,n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
     if(i%2!=0)
     {
        for(int j=1;j<n;j++)
          cout<<num;
        cout<<++num<<endl;
     }
     else
     {
         cout<<num+1;
         for(int j=1;j<n;j++)
          cout<<num;
         cout<<endl;
         num++;
 	}
  }
}