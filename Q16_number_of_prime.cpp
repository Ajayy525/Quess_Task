#include<bits/stdc++.h>
using namespace std;
int main(){
	int a;
	cout<<"enter the  number "<<endl;
	cin>>a;
	cout<<"Number of prime  till the "<<a<<" is"<<endl;
	for(int i=2;i<=a;i++){
		int flag=0;
		for(int j=2;j<=sqrt(i);j++){
			if(i%j==0){
				flag++;
				if(flag>0)
				break;
			}
		}
		if(flag==0){
			cout<<i<<endl;
		}
	}
	
	}
	
	
	

