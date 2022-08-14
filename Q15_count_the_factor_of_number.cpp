#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cout<<"enter the Number"<<endl;
	cin>>n;
	int cnt=0;
    cout<<"number of factor is"<<endl;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			cnt++;
//			cout<<i<<endl;
		}
		
	}
	cout<<cnt<<endl;
}
	
		
