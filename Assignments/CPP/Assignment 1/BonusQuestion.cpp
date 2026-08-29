#include <iostream>
using namespace std;

int main() {
	struct Layout1 { char c1; int i; char c2; }; //1+4+4 = 9 --> 12
	struct Layout2 { int i; char c1; char c2; }; // 4+1+1 = 6 --> 8

	cout <<"Size of Layout1: " <<sizeof(Layout1) << endl;
	cout << "Size of Layout2: "<<sizeof(Layout2);

	return 0;
}