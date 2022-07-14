#include<bits/stdc++.h>
using namespace std;
int main(){
	int a,b,i;
	int count=0;
	cin>>a>>b;
	
	for(int i=a;i<=b;i++){
		for(int j=2;j<sqrt(b);j++){
			if(i%j==0){
				count++;
//				cout<<"sgdh"<<endl;
			}
		}
	}
	return count;
}
