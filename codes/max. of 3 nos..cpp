#include<iostream>
using namespace std;
int main()
{
	int max,max1,max2,max3;
	cin>>max1>>max2>>max3;
		max=(max1>max2?max1:max2)>max3?(max1>max2?max1:max2):max3;
		cout<<max;
		return 0;
}
