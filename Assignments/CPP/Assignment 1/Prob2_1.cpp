#include <iostream>
using namespace std;

    void resetSensorPairV1(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    void resetSensorPairV2(int &a, int &b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    void resetSensorPairV3(int *a, int *b)
    {
        int temp = *a;
        *a = *b;
        *b = temp;
    }

int main(){

    int a = 10;
    int b = 20;

    cout <<endl;
    cout << "-----V1: Call By Value-----"<< endl;
    cout << "Before V1 A: " << a << " " << "B: " << b << endl;
    resetSensorPairV1(a ,b);
    cout << "After V1 A: " << a << " " << "B: " << b << endl;
    cout <<endl;
    cout << "-----V2: Call By Reference-----"<< endl;
    
    cout << "Before V2 A: " << a << " " << "B: " << b << endl;

    resetSensorPairV2(a, b);
    cout << "After V2 A: " << a << " " << "B: " << b << endl;
    cout <<endl;
    cout << "-----V3: Call By Pointer-----"<< endl;
    cout << "Before V3 A: " << a << " " << "B: " << b << endl;
    
    resetSensorPairV3(&a, &b);
    cout << "After V3 A: " << a << " " << "B: " << b << endl;
    cout <<endl;

    return 0;
}