#include<iostream>
using namespace std;
int main(){
  int f,s,c;
  cout<<"Enter first number : Enter second number : Menu\n";
  cout<<"1.Addition\n";
  cout<<"2.Subtraction\n";
  cout<<"3.Multiplication\n";
  cout<<"4.Division\n";
  cout<<"5.Remainder\n";
  
  
  cin>>f>>s>>c;
  
  switch(c){
    case 1:cout<<(f+s); break;
    case 2:cout<<(f-s); break;
    case 3:cout<<(f*s); break;
    case 4:cout<<(f/s); break;
    case 5:cout<<(f%s); break;
    default : cout<<"Invalid operation";
  }
}