#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cout<<"enter the number"<<endl;
	cin>>n;
//	int cnt=0;
    cout<<"factor of "<<n<<" is"<<endl;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			cout<<i<<endl;
		}
	}
}
	
		
