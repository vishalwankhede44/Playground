#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s;
  getline(cin,s);
  
  while(s.find("the ")<s.size()){
  s.erase(s.find("the "),4);
  }
  cout<<s;
}