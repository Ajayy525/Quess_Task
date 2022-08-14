#include<bits/stdc++.h>
using namespace std;
int main(){
	int sum=0;
	int digit,num,n,m;
	cout<<"enter the currency"<<endl;
	cin>>m;
	cout<<"Now enter the currency number"<<endl;
	cin>>n;
	num=n;
	
	while(n>0){ 
		digit=n%10;
		sum=sum*10+digit;
		n=n/10;
	}
	if(num==sum){
		cout<<"this currency will give three times that will equal to "<<(3*m)<<endl;
	}
	else {
		cout<<"this currency will not give three times "<<endl;
	}
}
