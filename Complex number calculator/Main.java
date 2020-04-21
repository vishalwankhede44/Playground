#include<iostream>
using namespace std;
struct Complex
{
   int real;
   int img;
};
int main()
{
   int c;
   cin>>c;
   Complex c1,c2,c3;
   cin>>c1.real>>c1.img;
   cin>>c2.real>>c2.img;
   if(c==1)
     cout<<(c1.real+c2.real)<<"+"<<(c1.img+c2.img)<<"i";
   else if(c==2){
     cout<<(c1.real-c2.real)<<"+"<<(c1.img-c2.img)<<"i";
   }
  else if(c==3)
  {
      c3.real = c1.real * c2.real - c1.img * c2.img;
      //c3.img = ((c1.real * c2.img) + ((c1.img * c2.img)*(-1))+(c1.img*c2.real));
      c3.img = (c1.real+c1.img)*c2.img;
      if(c3.img<0)
        cout<<c3.real<<c3.img<<"i";
      else
        cout<<c3.real<<"+"<<c3.img<<"i";
  }
  else
    cout<<"Invalid choice";
     
}