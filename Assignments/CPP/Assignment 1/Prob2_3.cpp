#include <iostream>
using namespace std;

int main(){

    int statusReg = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg = 0b11001010;

    const int *regPtr1 = &statusReg;
    cout <<"First: " << *regPtr1; 

    // *regPtr1 = 89;
    // cout << *regPtr1; // error: assignment of read-only location '* regPtr1

    // regPtr1 = &controlReg;
    // cout << regPtr1; // adress can be changed


    int* const regPtr2 = &controlReg;
    cout <<"Second: " << *regPtr2; 

    const int * const regPtr3 = &dataReg;
    cout <<"Third: " << *regPtr3; 
    return 0;
}