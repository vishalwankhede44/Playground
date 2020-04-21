#include<iostream>
using namespace std;
int main()
{
  string s;
  int i=0;
  char c;
  for(;;)
  {
      cin>>s;
      if(s=="####")
        break;
      
      if(i==0){
        i++;
        c = s[s.size()-1];
        cout<<s<<endl;;
        continue;
      }else
      {
          if(s[0] == c){
            cout<<s<<endl;
            c = s[s.size()-1];
          }
          
      }    
  }
}