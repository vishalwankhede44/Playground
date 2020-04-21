#include<iostream>
using namespace std;
int isPrime(int N){
    if(N<2 || (!(N&1) && N!=2))
        return 0;
    for(int i=3; i*i<=N; i+=2){
        if(!(N%i))
            return 0;
    }
    return 1;
}
int main()
{
 	int n;
    cin>>n;
    if(isPrime(n))
      cout<<"Eligible";
    else
      cout<<"Not eligible";
}
